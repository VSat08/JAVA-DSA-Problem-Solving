public class PlaceTilesInFloor {

    public static int placeTiles(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        // vertical placemenets
        int vp = placeTiles(n - m, m);
        // horizontal placemenets
        int hp = placeTiles(n
                - 1, m);

        return hp + vp;
    }

    public static void main(String[] args) {
        int n = 4, m = 1;
        System.out.println(placeTiles(n, m));
    }
}
