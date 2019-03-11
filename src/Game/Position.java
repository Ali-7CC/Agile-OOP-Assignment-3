package Game;

import java.util.stream.IntStream;

public class Position {
    // Fields
    private int x;
    private int y;

    // Constructor
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isValid() {
        int[] validP = {0, 1, 2, 3, 4, 5, 6, 7};
        boolean valid = false;
        if ((IntStream.of(validP).anyMatch(x -> x == this.x))
                && (IntStream.of(validP).anyMatch(x -> x == this.y))) {
            valid = true;
        }
        return valid;
    }

}
