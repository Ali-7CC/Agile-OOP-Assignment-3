package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    // Fields
    Position oldPosition;
    Position newPosition;

    // Constructor


    // Methods
    public void setOldPosition() {
        int x;
        int y;
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the coordinates of the piece to be moved:");
                System.out.print("    X: ");
                x = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                s.nextLine();
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("    Y: ");
                y = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                s.nextLine();
                continue;
            }

            break;
        }

        oldPosition = new Position(x,y);
    }

    public void setNewPosition() {
        int x;
        int y;
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please enter the coordinates of the new position:");
                System.out.print("    X: ");
                x = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                s.nextLine();
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("    Y: ");
                y = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                s.nextLine();
                continue;
            }

            break;
        }

        newPosition = new Position(x,y);
    }
}
