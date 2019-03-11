package Game;

/**
 * Agile Object-oriented Software Development 02160
 * Assignment 3 - Mar 19
 * Function: Simplified checkers. Prints a board and moves pieces (no jumps or crowning).
 * No. of files: 6 (inclusive)
 *
 * @author Ali Jawad El-Madani - s174404
 */
public class Game {
    public static void main(String[] args) {
        // Initializing the board.
        int[][] board = new int[8][8];
        board[0][1] = 1;
        board[0][3] = 1;
        board[0][5] = 1;
        board[0][7] = 1;

        board[1][0] = 1;
        board[1][2] = 1;
        board[1][4] = 1;
        board[1][6] = 1;

        board[2][1] = 1;
        board[2][3] = 1;
        board[2][5] = 1;
        board[2][7] = 1;

        board[5][0] = 2;
        board[5][2] = 2;
        board[5][4] = 2;
        board[5][6] = 2;

        board[6][1] = 2;
        board[6][3] = 2;
        board[6][5] = 2;
        board[6][7] = 2;

        board[7][0] = 2;
        board[7][2] = 2;
        board[7][4] = 2;
        board[7][6] = 2;

        // Creating the objects
        Board b = new Board(board);
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Input in = new Input();
        // Starting the game
        int turn = 1;
        while (true) {
            if (turn == 1) {
                System.out.println("");
                b.displayBoard();
                System.out.println("");
                System.out.println("Game.Player one's turn");
                // Taking player one's input and checking its validity
                Input p1Input = new Input();
                p1Input.setOldPosition();
                if (!p1Input.oldPosition.isValid()) {
                    System.out.println("Game.Position is not on the board! Please try again");
                    continue;
                }
                p1Input.setNewPosition();
                if (!p1Input.newPosition.isValid()) {
                    System.out.println("Game.Position is not on the board! Please try again");
                    continue;
                }
                // Checking whether the move is valid
                boolean check = p1.checkMove(b, p1Input.oldPosition, p1Input.newPosition);
                if (check) {
                    p1.move(b, p1Input.oldPosition, p1Input.newPosition);
                    System.out.println("Piece moved!");
                    turn = 2;
                } else {
                    System.out.println("");
                    System.out.println("Invalid move. Please try again.");
                }
            } else if (turn == 2) {
                System.out.println("");
                b.displayBoard();
                System.out.println("");
                System.out.println("Game.Player two's turn");
                // Taking player two's input and checking its validity
                Input p2Input = new Input();
                p2Input.setOldPosition();
                if (!p2Input.oldPosition.isValid()) {
                    System.out.println("Game.Position is not on the board! Please try again");
                    continue;
                }
                p2Input.setNewPosition();
                if (!p2Input.newPosition.isValid()) {
                    System.out.println("Game.Position is not on the board! Please try again");
                    continue;
                }
                // Checking whether the move is valid
                boolean check = p2.checkMove(b, p2Input.oldPosition, p2Input.newPosition);
                if (check) {
                    p2.move(b, p2Input.oldPosition, p2Input.newPosition);
                    System.out.println("Piece moved!");
                    turn = 1;
                } else {
                    System.out.println("");
                    System.out.println("Invalid move. Please try again.");
                }

            }
        }

    }
}
