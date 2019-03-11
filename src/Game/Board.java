package Game;

public class Board {
    // Fields
    private int[][] board;

    // Constructor
    public Board(int[][] board){
        this.board = board;
    }

    // Methods

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board){
        this.board = board;

    }

    public void displayBoard(){
        String[][] boardStr = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 0) {
                    boardStr[i][j] = "   ";
                } else {
                    boardStr[i][j] = " " + String.valueOf(board[i][j]) + " ";
                }
            }
        }
        System.out.println("    0  1  2  3  4  5  6  7  ");
        System.out.println("  +-------------------------+");
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " |" + boardStr[i][0] + boardStr[i][1] + boardStr[i][2] + boardStr[i][3] + boardStr[i][4] + boardStr[i][5] + boardStr[i][6] + boardStr[i][7] + " |");
        }
        System.out.println("  +-------------------------+ ");
        System.out.println("    0  1  2  3  4  5  6  7       <- x-axis");

    }

}
