package Recursion;

// print x^n(stack heigh =n)

public class Exponent {

    public static int calcPower(int x, int n) {

        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return x * calcPower(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 3, n = 4;
        System.out.println(calcPower(x, n));
    }
}
