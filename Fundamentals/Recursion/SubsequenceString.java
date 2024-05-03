package Fundamentals.Recursion;

public class SubsequenceString {
    public static void printSubsequenceString(String str, int index, String newStr) {

        if (index == str.length()) {

            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(index);

        printSubsequenceString(str, index + 1, newStr + curr);
        printSubsequenceString(str, index + 1, newStr);

    }

    public static void main(String[] args) {
        printSubsequenceString("abc", 0, "");
    }
}
