package Fundamentals.Recursion;

public class FirstAndLastOccuranceOfString {
    public static int first = -1;
    public static int last = -1;

    public static void findFirstAndLastOccurrence(String str, int index, char c) {
        if (index == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        char curr = str.charAt(index);
        if (curr == c) {
            if (first == -1) {
                first = index; // Store the index as the first occurrence
            }
            last = index; // Update the last occurrence
        }

        findFirstAndLastOccurrence(str, index + 1, c); // Recursive call
    }

    public static void main(String[] args) {
        findFirstAndLastOccurrence("aabaceadfa", 0, 'a');
    }
}