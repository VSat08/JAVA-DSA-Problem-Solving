
/*
 * Print all the duplicate characters in a string
Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.

Example:

Input: S = “geeksforgeeks”
Output:

e, count = 4
g, count = 2
k, count = 2
s, count = 2

Explanation: e,g,k,and s are characters which are occured in string in more than one times.
 */
public class PrintDuplicateCharacters {

     public static int ch [] = new int [26];
    public static void printDuplicates(String str) {
        for (char c : str.toCharArray()) {
            ch[c - 'a']++;
        }

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >1)
            System.out.println( (char)(i + 'a') + ",  count= " + ch[i] );
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        printDuplicates(str);
    }
}
