
/*
 * Given two Strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
 * 
 */


public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // Check if the lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Create character count arrays for both strings
        int[] charCountS = new int[26];
        int[] charCountT = new int[26];

        // Count the characters in both strings
        for (int i = 0; i < s.length(); i++) {
            charCountS[s.charAt(i) - 'a']++;
            charCountT[t.charAt(i) - 'a']++;
        }

        // Compare the character count arrays
        for (int i = 0; i < 26; i++) {
            if (charCountS[i] != charCountT[i]) {
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t)); // Output: true

        s = "rat";
        t = "car";
        System.out.println(isAnagram(s, t)); // Output: false
    }
}