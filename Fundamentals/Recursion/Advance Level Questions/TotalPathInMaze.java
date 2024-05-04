public class TotalPathInMaze {

    public static int totalPathInMaze(int i, int j, int n, int m) {
    
        if (i == n || j == m) {
            return 0;
        }


        if (i == n - 1 && j == m - 1) {
            return 1;
        }
    // move downwards
    int downPath = totalPathInMaze(i + 1, j, n, m);
    int rightPath = totalPathInMaze(i, j + 1, n, m);
    
    return downPath + rightPath;
}
    public static void main(String[] args) {
        int n = 3, m = 3;
        

        System.out.println(totalPathInMaze(0, 0, n, m));
    }
}
