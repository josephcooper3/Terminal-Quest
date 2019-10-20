package abilities;

import beings.Enemy;

public class Axe extends Weapon {

    private String type;
    private int damage;

    public Axe() {
        this.type = "Axe";
        this.damage = 2;
    }

    public String attack(Enemy target, int multiplier) {
        int damageToDeal = this.damage * multiplier;
        if (target instanceof IDefend) {
            damageToDeal -= ((IDefend) target).defend();
        }
        target.takeDamage(damageToDeal);
        return "Swish Thwack!";
    }

    public String getType() {
        return type;
    }
}
