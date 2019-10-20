package rooms;

import beings.Enemy;
import beings.Player;

import java.util.ArrayList;

public class Room {

    private Player player;
    private ArrayList<Enemy> enemies;
    private boolean cleared;

    public Room(Player player) {
        this.player = player;
        this.enemies = new ArrayList<Enemy>();
        this.cleared = false;
    }

}
