
/*
 * 
 * Easy
Topics
Companies
Hint
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 */
public class RemoveadjacentDuplicates {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca")); // Output: "ca"
        System.out.println(removeDuplicates("azxxzy")); // Output: "ay"
        System.out.println(removeDuplicates("abcd")); // Output: "abcd"
        System.out.println(removeDuplicates("aaaa")); // Output: ""
    }
}
