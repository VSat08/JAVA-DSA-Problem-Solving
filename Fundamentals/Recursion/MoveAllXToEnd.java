package Fundamentals.Recursion;

/**
 * MoveAllXToEnd
 */
public class MoveAllXToEnd {

    public static void moveAllXToEnd(String str, int index, int count, String newStr) {

        if (index == str.length()) {

            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(index);
        if (curr == 'x') {
            count++;
            moveAllXToEnd(str, index + 1, count, newStr);
        } else {
            newStr += curr;
            moveAllXToEnd(str, index + 1, count, newStr);
        }

    }

    public static void main(String[] args) {

        String str = "axbxgxcc";
        moveAllXToEnd(str, 0, 0, "");
    }
}