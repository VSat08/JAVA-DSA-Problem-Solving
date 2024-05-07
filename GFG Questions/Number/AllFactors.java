/*
 * Find all factors of a Natural Number in sorted order
Last Updated : 13 Dec, 2023
Given a natural number n, print all distinct divisors of it.

Examples: 

 Input : n = 10       
 Output: 1 2 5 10

 Input:  n = 100
 Output: 1 2 4 5 10 20 25 50 100

 Input:  n = 125
 Output: 1 5 25 125 
 */

import java.util.*;

public class AllFactors {
    public static int[] printFactor(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        Collections.sort(factors);

        // Convert ArrayList to array
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(printFactor(n)));
    }
}
