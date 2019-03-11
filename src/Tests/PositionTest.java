package Tests;

import Game.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    Position p;

    @Test
    public void isValid() {
        // Invalid x coordinate
        p = new Position(-10,2);
        assertFalse("Invalid position",p.isValid());
        p = new Position(10, 2);
        assertFalse("Invalid position",p.isValid());

        // Invalid y coordinate
        p = new Position(2,-10);
        assertFalse("Invalid position",p.isValid());
        p = new Position(2, 10);
        assertFalse("Invalid position",p.isValid());

        // Invalid x and y coordinates
        p = new Position(-2,-1);
        assertFalse("Invalid position",p.isValid());
        p = new Position(10, 13);
        assertFalse("Invalid position",p.isValid());

        // Valid coordinate
        p = new Position(1,2);
        assertTrue("Valid position",p.isValid());

    }
}