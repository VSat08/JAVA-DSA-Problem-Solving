/*Replace all ‘0’ with ‘5’ in an input Integer
Last Updated : 25 Apr, 2023
Given an integer as input and replace all the ‘0’ with ‘5’ in the integer. 

Examples: 

Input: 102 
Output: 152
Explanation: All the digits which are '0' is replaced by '5' 

Input: 1020 
Output: 1525
Explanation: All the digits which are '0' is replaced by '5'
The use of an array to store all digits is not allowed. */
public class ReplaceDigits {
    public static int replaceDigits(int n) {
        
        StringBuilder sb = new StringBuilder(String.valueOf(n));

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '5');
            }

        }
        
        return Integer.parseInt(sb.toString());


    }
    public static void main(String[] args) {
        System.out.println(replaceDigits(1020));
    }
}
