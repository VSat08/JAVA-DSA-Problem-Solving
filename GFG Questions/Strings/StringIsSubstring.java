
/*
 * 
 * 
 * Check if a string is substring of another
Last Updated : 08 May, 2023
Given two strings S1 and S2, The task is to find if S1 is a substring of S2. If yes, return the index of the first occurrence, else return -1.

Examples : 

Input: S1 = “for”, S2= “geeksforgeeks”
Output: 5
Explanation: String “for” is present as a substring of s2.

Input: S1 = “practice”, S2= “geeksforgeeks”
Output: -1.
Explanation: There is no occurrence of “practice” in “geeksforgeeks”

 */
public class StringIsSubstring {
    public static void checksubstring(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s2);
        if (!(sb.indexOf(s1) == -1)) {
            System.out.println("String "  + s1 +  " is present as a substring of " +  s2);
        }
        else {
            System.out.println("There is no occurrence of  "  +  s1+ " in " +  s2);
        }

    }
    public static void main(String[] args) {
        String s1 = "practice", s2 = "geeksforgeeks";
        
        checksubstring(s1, s2);
    }
}
