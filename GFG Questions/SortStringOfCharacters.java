
/*Sort string of characters
Last Updated : 29 Feb, 2024
Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.

Examples: 

Input : bbccdefbbaa 
Output : aabbbbccdef
Input : geeksforgeeks
Output : eeeefggkkorss */

import java.util.Arrays;

public class SortStringOfCharacters {
    public static char map[] = new char[26];

    public static String sort(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "bbccdefbbaa";

        System.out.println(sort(str));

    }
}
