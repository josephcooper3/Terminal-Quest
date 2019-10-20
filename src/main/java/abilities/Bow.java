package abilities;

import beings.Enemy;

public class Bow extends Weapon {

    private int damage;

    public Bow() {
        super("Bow");
        this.damage = 1;
    }

    public String attack(Enemy target, int multiplier) {
        target.takeDamage(this.damage * multiplier);
        return "Twang thunk!";
    }

}
