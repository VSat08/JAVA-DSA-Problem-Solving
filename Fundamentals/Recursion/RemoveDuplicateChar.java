package Fundamentals.Recursion;

public class RemoveDuplicateChar {

    public static boolean[] map = new boolean[26];

    public static void removeDuplicateChar(String str, int index, String newStr) {

        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(index);

        if (map[curr - 'a']) {
            
            removeDuplicateChar(str, index + 1, newStr);
        } else {
            newStr += curr;
            map[curr - 'a'] = true;
            removeDuplicateChar(str, index+1, newStr);
        }
    }

    public static void main(String[] args) {
        removeDuplicateChar("abcaddcbbefffabg", 0, "");
    }
}
