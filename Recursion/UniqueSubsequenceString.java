package Recursion;

import java.util.HashSet;

public class UniqueSubsequenceString {
    public static void printUniqueSubsequence(String str, int index, String newStr, HashSet<String> set) {

        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {

                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char curr = str.charAt(index);

        printUniqueSubsequence(str, index + 1, newStr + curr, set);
        printUniqueSubsequence(str, index + 1, newStr, set);

    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequence("aaa", 0, "", set);
    }
}
