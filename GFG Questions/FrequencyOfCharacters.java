
/*
 * 
 * Print characters and their frequencies in order of occurrence


 Given string str containing only lowercase characters. The problem is to print the characters along with their frequency in the order of their occurrence and in the given format explained in the examples below.

Examples: 

Input : str = "geeksforgeeks"
Output : g2 e4 k2 s2 f1 o1 r1

Input : str = "elephant"
Output : e2 l1 p1 h1 a1 n1 t1
 */
public class FrequencyOfCharacters {

    public static int map[] = new int[26];

    public static void freq(String str) {

        for (char i : str.toCharArray()) {
            map[i - 'a'] ++;
        }
        for (char i : str.toCharArray()) {
            if (map[i - 'a'] != 0) {
                System.out.print(i + "" +  map[i - 'a'] +" ");
                map[i - 'a'] = 0;
            }
        }

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        freq(str);
    }
}
