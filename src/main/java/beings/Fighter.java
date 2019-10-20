package beings;

import abilities.Weapon;

public class Fighter extends Player {

    private Weapon weapon;
    private String skilledWith;

    public Fighter(String name, Weapon weapon, String skilledWith) {
        super(name);
        this.weapon = weapon;
        this.skilledWith = skilledWith;
    }

    public int getMultiplier() {
        if (this.weapon.getType() == this.skilledWith) {
            return 2;
        } else {
            return 1;
        }
    }

    public String attack(Enemy target) {
        return this.weapon.attack(target, this.getMultiplier());
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}
