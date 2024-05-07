/*
 * 
 * You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 

Constraints:

1 <= people.length <= 5 * 104
1 <= people[i] <= limit <= 3 * 104


 */

import java.util.Arrays;

public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        // Sort the array to simplify the boat allocation process
        Arrays.sort(people);

        // Initialize two pointers, one at the beginning and one at the end of the array
        int left = 0; // Pointer for the lightest person
        int right = people.length - 1; // Pointer for the heaviest person
        int boatsCount = 0; // Count of boats required

        // Iterate until both pointers meet or cross each other
        while (left <= right) {
            // If both the lightest and heaviest persons can fit in the same boat
            if (people[left] + people[right] <= limit) {
                boatsCount++; // Allocate a boat
                left++; // Move to the next lightest person
                right--; // Move to the next heaviest person
            }
            // If only the heaviest person can fit in a boat
            else if (people[right] <= limit) {
                boatsCount++; // Allocate a boat
                right--; // Move to the next heaviest person
            }
        }

        return boatsCount; // Return the total count of boats required
    }



    public static void main(String[] args) {
        int[] people = { 3, 5, 3, 4 };
        int limit = 5;
        System.out.println("Minimum number of boats required: " + numRescueBoats(people, limit));
    }
}
