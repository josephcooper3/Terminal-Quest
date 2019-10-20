package abilities;

import beings.Enemy;

public class Bow extends Weapon implements IUnblockable {

    private String type;
    private int damage;

    public Bow() {
        this.type = "Bow";
        this.damage = 1;
    }

    public String attack(Enemy target, int multiplier) {
        target.takeDamage(this.damage * multiplier);
        return "Twang thunk!";
    }

    public String getType() {
        return type;
    }

}
