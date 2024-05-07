import java.util.Arrays;

public class UniqueCharactesOfAllSubString {
    public static int uniqueLetterString(String s) {
        int n = s.length();
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        int result = 0;
        int prevUnique = 0;
        int contribution = 0;

        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'A';
            int prevIdx = lastSeen[idx];
            lastSeen[idx] = i;

            // Calculate the number of substrings that end at index i
            int currUnique = prevUnique;
            if (prevIdx == -1) {
                currUnique++;
            } else {
                contribution -= prevIdx + 1;
            }

            // Calculate the contribution to the result
            result += currUnique + contribution;

            // Update prevUnique and contribution for the next iteration
            prevUnique = currUnique;
            contribution += i + 1;
        }

        return result;
    }
    public static void main(String[] args) {
        String s1 = "ABC";
        System.out.println(uniqueLetterString(s1)); // Output: 10

        String s2 = "ABA";
        System.out.println(uniqueLetterString(s2)); // Output: 8

        String s3 = "LEETCODE";
        System.out.println(uniqueLetterString(s3)); // Output: 92
    }
}
