public class FindTheDifference {

    public static char findTheDifference(String s, String t) {

        int charS[] = new int[26];

        for (char c : s.toCharArray()) {
            charS[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charS[c - 'a']--;
        }

        for (int i = 0; i < charS.length; i++) {
            if (charS[i] < 0) {
                return (char) (i + 'a');
            }
        }
        return 'N';
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";

        System.out.println(findTheDifference(s, t));
    }
}
