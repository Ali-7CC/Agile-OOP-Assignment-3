package Game;

public interface Player {
    public boolean checkMove(Board b, Position oldP, Position newP);
    public void move(Board b, Position oldP, Position newP);
}
