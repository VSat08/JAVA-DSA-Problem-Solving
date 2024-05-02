
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 34, 2, 9, 1, 100 };

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
