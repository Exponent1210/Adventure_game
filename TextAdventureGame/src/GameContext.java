// GameContext.java
import java.util.Scanner;

public class GameContext {
    private Player player;
    private Scanner scanner;

    public GameContext() {
        player = new Player();
        scanner = new Scanner(System.in);
    }

    public Player getPlayer() { return player; }
    public Scanner getScanner() { return scanner; }
}
