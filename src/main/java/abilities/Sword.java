package abilities;

import beings.Enemy;

public class Sword extends Weapon {

    private String type;
    private int damage;

    public Sword() {
        super("Sword");
        this.damage = 3;
    }

    public String attack(Enemy target, int multiplier) {
        int damageToDeal = this.damage * multiplier;
        if (target instanceof IDefend) {
            damageToDeal -= ((IDefend) target).defend();
        }
        target.takeDamage(damageToDeal);
        return "Slicey slicey!";
    }

}
