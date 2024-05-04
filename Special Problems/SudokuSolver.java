public class SudokuSolver {
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        } // for grid
        int startingRow = (row / 3) * 3;
        int startingCol = (col / 3) * 3;
        for (int i = startingRow; i < startingRow + 3; i++) {
            for (int j = startingCol; j < startingCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if (col != board.length - 1) {
            newRow = row;
            newCol = col + 1;
        } else {
            newRow = row + 1;
            newCol = 0;
        }
        if (board[row][col] != '_') {
            if (helper(board, newRow, newCol)) {
                return true;
            } else {
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helper(board, newRow, newCol)) {
                            return true;
                        } else {
                            board[row][col] = '_';
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void solvSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {

    }
}