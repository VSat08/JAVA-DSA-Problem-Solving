package Fundamentals.Recursion;

public class ReverseString {
    public static void reverse(String S, int index) {
        if (index == 0) {
            System.out.println(S.charAt(index));
            return;
        }
        System.out.println(S.charAt(index));
        
        
        reverse(S, index-1);
   }
    public static void main(String[] args) {
        String S = "hello";
        reverse(S,S.length() -1);
    }
}
