package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String source, String Helper, String Destination) {

        if (n == 1) {
            System.out.println(n + " Transfer disk from " + source + "  To " + Destination);
            return;
        }

        towerOfHanoi(n - 1, source, Destination, Helper);
        System.out.println(n + " Transfer disk from " + source + "  To " + Destination);
        towerOfHanoi(n - 1, Helper, source, Destination);
    }

    public static void main(String[] args) {

        towerOfHanoi(3, "S", "H", "D");

    }
}
