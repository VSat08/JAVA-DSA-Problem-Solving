/*
 * Program to add two fractions
Last Updated : 26 Aug, 2022
Add two fraction a/b and c/d and print answer in simplest form.
Examples : 
 

Input:  1/2 + 3/2
Output: 2/1

Input:  1/3 + 3/9
Output: 2/3

Input:  1/5 + 3/15
Output: 2/5
 */

public class AddFraction {
    public static void addFraction(int num1, int den1, int num2, int den2) {
        int num, den, x;
        System.out.print("(" + num1 + " / " + den1 + ") + (" + num2 + " / " + den2 + ") = ");
        // logic for calculating sum of two fractions
        if (den1 == den2) {
            num = num1 + num2;
            den = den1;
        } else {
            num = (num1 * den2) + (num2 * den1);
            den = den1 * den2;
        }
        if (num > den)
            x = num;
        else
            x = den;
        for (int i = 1; i <= x; i++) {
            if (num % i == 0 && den % i == 0) {
                num = num / i;
                den = den / i;
            }
        }
        // logic for getting simplified fraction
        int n = 1;
        int p = num;
        int q = den;
        if (num != den) {
            while (n != 0) {
                // storing remainder
                n = num % den;
                if (n != 0) {
                    num = den;
                    den = n;
                }
            }
        }
        System.out.println("(" + p / den + " / " + q / den + ")");
    }

    public static void main(String[] args) {
        addFraction(1, 3, 3, 9);
    }
}
