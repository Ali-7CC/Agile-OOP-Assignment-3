package Tests;

import Game.Board;
import Game.Player2;
import Game.Position;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Player2Test {
    private int[][] board = new int[8][8];
    private Player2 p2;
    private Board b;

    @Before
    public void initialize(){

        board[2][1] = 1;
        board[2][5] = 1;
        board[3][6] = 1;

        board[5][2] = 2;
        board[5][4] = 2;
        board[6][5] = 2;



        p2 = new Player2();
        b = new Board(board);
    }


    @Test
    public void checkMove() {
        // Forward right
        assertTrue("Should be valid",p2.checkMove(b, new Position(2,5), new Position(3,4)));
        // Forward left
        assertTrue("Should be valid",p2.checkMove(b, new Position(2,5), new Position(1,4)));

        // Backwards
        assertFalse("Should be invalid",p2.checkMove(b, new Position(2,5), new Position(1,6)));
        // Straight
        assertFalse("Should be invalid",p2.checkMove(b, new Position(2,5), new Position(2,4)));
        // Long distance
        assertFalse("Should be invalid",p2.checkMove(b, new Position(2,5), new Position(4,3)));
        // Blocked place
        assertFalse("Should be invalid",p2.checkMove(b, new Position(5,6), new Position(4,5)));
        // Player one's piece
        assertFalse("Should be invalid",p2.checkMove(b, new Position(1,2), new Position(2,3)));
    }

    @Test
    public void move() {
        // Should display the correct board
        p2.move(b,new Position(2,5), new Position(3,4));
        b.displayBoard();
    }
}