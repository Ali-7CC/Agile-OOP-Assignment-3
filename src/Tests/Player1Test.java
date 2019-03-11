package Tests;

import Game.Board;
import Game.Player1;
import Game.Position;
import org.junit.Before;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Player1Test {

    private int[][] board = new int[8][8];
    private Player1 p1;
    private Board b;

    @Before
    public void initialize(){

        board[2][1] = 1;
        board[2][5] = 1;
        board[3][6] = 1;

        board[5][2] = 2;
        board[5][4] = 2;
        board[6][5] = 2;



        p1 = new Player1();
        b = new Board(board);
    }



    @org.junit.Test
    public void checkMove() {
        // Forward right
        assertTrue("Should be valid",p1.checkMove(b, new Position(1,2), new Position(2,3)));
        // Forward left
        assertTrue("Should be valid",p1.checkMove(b, new Position(1,2), new Position(0,3)));

        // Backwards
        assertFalse("Should be invalid",p1.checkMove(b, new Position(1,2), new Position(0,1)));
        // Straight
        assertFalse("Should be invalid",p1.checkMove(b, new Position(1,2), new Position(1,3)));
        // Long distance
        assertFalse("Should be invalid",p1.checkMove(b, new Position(1,2), new Position(3,4)));
        // Blocked place
        assertFalse("Should be invalid",p1.checkMove(b, new Position(5,2), new Position(6,3)));
        // Player two's piece
        assertFalse("Should be invalid",p1.checkMove(b, new Position(2,5), new Position(3,4)));



    }

    @org.junit.Test
    public void move() {
        // Should display the correct board
        p1.move(b,new Position(1,2), new Position(2,3));
        b.displayBoard();
    }
}