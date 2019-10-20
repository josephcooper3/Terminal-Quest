package beings;

import abilities.IDefend;
import abilities.IFirstStrike;

public class Berserker extends Enemy implements IFirstStrike, IDefend {

    public Berserker() {
        super(6);
    }

    public int defend() {
        return 1;
    }

    public int firstStrike() {
        return 2;
    }

}
