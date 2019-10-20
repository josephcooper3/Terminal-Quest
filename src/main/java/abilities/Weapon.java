package abilities;

import beings.Enemy;

public abstract class Weapon {

    private String type;
    private int damage;

    public Weapon(String type) {
        this.type = type;
    }

    public abstract String attack(Enemy target, int multiplier);

    public String getType(){
        return this.type;
    }

}
