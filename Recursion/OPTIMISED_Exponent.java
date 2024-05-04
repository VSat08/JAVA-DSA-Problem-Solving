package Recursion;
// print x^n(stack heigh =logn)

public class OPTIMISED_Exponent {
    public static int calcOptmisedPower(int x, int n) {

        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return calcOptmisedPower(x, n / 2) * calcOptmisedPower(x, n / 2);
        } else {
            return x * calcOptmisedPower(x, n/2) * calcOptmisedPower(x, n / 2);

        }

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(calcOptmisedPower(x, n));
    }
}
