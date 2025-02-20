// Player.java
import java.util.ArrayList;
import java.util.List;

public class Player {
    private int health;
    private List<String> inventory;

    public Player() {
        health = 100;
        inventory = new ArrayList<>();
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public List<String> getInventory() { return inventory; }
    public void addItem(String item) { inventory.add(item); }
}
