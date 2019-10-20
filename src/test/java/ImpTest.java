import abilities.Axe;
import beings.Dwarf;
import beings.Imp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImpTest {

    Imp imp;

    @Before
    public void before() {
        imp = new Imp();
    }

    @Test
    public void startsWith1HealthPoint() {
        assertEquals(1, imp.getHealthPoints());
    }

    @Test
    public void cannotOverkill() {
        imp.takeDamage(2);
        assertEquals(0, imp.getHealthPoints());
    }

    @Test
    public void cannotDefend() {
        Axe myAxe = new Axe();
        Dwarf dwarf = new Dwarf("Gimli", myAxe);
        dwarf.attack(imp);
        assertEquals(0, imp.getHealthPoints());
    }

}
