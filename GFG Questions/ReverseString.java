public class ReverseString {

    public static String reverseString(String str) {
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseString(str));
    }

}
