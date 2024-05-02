package Fundamentals;

/**
 * Strings
 */
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fname = "Ram";
        String lname = "Shyam";

        // concatenation
        String fullname = fname + "@" + lname;
        System.out.println(fullname);

        // length
        System.out.println(fullname.length());

        // iteration of letters
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.println();

        // Comparison of Strings

        // s1>s2 => +ve value
        // s1==s2 => 0
        // s1<s2 => -ve value

        String str1 = "Sam";
        String str2 = "Ram";
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        // strings using new String()
        String strng1 = new String("Hello");
        String strng2 = new String("Hello");

        if (strng1 == strng2) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        // Substrings

        String s1 = "Hello World!";
        System.out.println(s1.substring(1,3));
        in.close();
    }

}