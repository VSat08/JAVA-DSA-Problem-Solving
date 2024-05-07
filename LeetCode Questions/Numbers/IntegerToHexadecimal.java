/**
 * IntegerToHexadecimal
 */
public class IntegerToHexadecimal {
    public static String tohex(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            return "0";
        }

        while (num != 0) {
            int x = num & 15;
            if (x < 10) {
                sb.insert(0, x);
            } else {
                sb.insert(0, (char) (x - 10 + 'a'));
            }
            num >>>= 4;
        }

        return sb.toString();
    }
    

    public static void main(String[] args) {
        int n = 26;
        System.out.println((tohex(n)));
    }

}

