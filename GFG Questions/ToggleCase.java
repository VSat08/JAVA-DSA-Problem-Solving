
/*
 * 
 * Convert characters of a string to opposite case
Last Updated : 17 Oct, 2023
Given a string, convert the characters of the string into the opposite case,i.e. if a character is the lower case then convert it into upper case and vice-versa. 

Examples: 

Input : geeksForgEeks
Output : GEEKSfORGeEKS
Input : hello every one
Output : HELLO EVERY ONE
 */
public class ToggleCase {

    public static String oppositeCase(String str) {

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "geeksForgEeks";

        System.out.println(oppositeCase(str));

    }
}
