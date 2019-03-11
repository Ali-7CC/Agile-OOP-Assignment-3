package Game;

public class Player2 implements Player {

    public boolean checkMove(Board b, Position oldP, Position newP) {
        boolean check;
        int[][] board = b.getBoard();
        int oldP_content = board[oldP.getY()][oldP.getX()];
        int newP_content = board[newP.getY()][newP.getX()];
        int x_diff = Math.abs(oldP.getX() - newP.getX());
        if ((oldP_content == 2) && (newP_content == 0) && (newP.getY() - oldP.getY() == -1) && (x_diff == 1)) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }


    public void move(Board b, Position oldP, Position newP) {
        int[][] board = b.getBoard();
        board[oldP.getY()][oldP.getX()] = 0;
        board[newP.getY()][newP.getX()] = 2;
        b.setBoard(board);

    }
}
