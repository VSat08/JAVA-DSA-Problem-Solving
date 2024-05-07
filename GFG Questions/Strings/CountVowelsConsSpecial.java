
/*Program to count vowels, consonant, digits and special characters in string.
Given a string and the task is to count vowels, consonant, digits and special character in string. Special character also contains the white space.
Examples: 
 

Input : str = "geeks for geeks121"
Output : Vowels: 5
Consonant: 8
Digit: 3
Special Character: 2

Input : str = " A1 B@ d  adc"
Output : Vowels: 2
Consonant: 4
Digit: 1
Special Character: 6 
         
*/

public class CountVowelsConsSpecial {
    public static void countCharacterType(String str) {
        int dig = 0, vow = 0, cons = 0, spec = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                char ch = Character.toLowerCase(str.charAt(i));

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                } else {
                    cons++;
                }
            } else if (Character.isDigit(str.charAt(i))) {
                dig++;
            } else {
                spec++;
            }
        }

        System.out.println(str);
        System.out.println("Vowels: " + vow);
        System.out.println("Consonant: " + cons);
        System.out.println("Digit: " + dig);
        System.out.println("Special Character: " + spec);
    }

    public static void main(String[] args) {
        String str = "geeks for geeks121";

        countCharacterType(str);
    }

}
