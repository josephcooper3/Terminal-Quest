package beings;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 10;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public abstract String attack(Enemy target);

    public void takeDamage(int amount) {
        if (this.healthPoints - amount >= 0) {
            this.healthPoints -= amount;
        } else {
            this.healthPoints = 0;
        }
    }

}
