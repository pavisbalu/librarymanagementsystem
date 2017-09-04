package in.pavithra.tictactoe;

public class Game {
    private static int[][] board=new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};;

    public static int[][] getBoard() {

        return board;
    }

    public static void clear() {
        board = new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    }

    public static int[][] play(int row, int column) {
        board[row][column] = 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                    return board;
                }
            }

        }
        return board;


    }



}
