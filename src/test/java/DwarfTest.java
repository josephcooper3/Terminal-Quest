import abilities.Axe;
import abilities.Sword;
import beings.Dwarf;
import beings.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe myAxe;
    Troll troll;

    @Before
    public void before() {
        myAxe = new Axe();
        dwarf = new Dwarf("Gimli", myAxe);
        troll = new Troll();
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void healthPointsStartsAt10() {
        assertEquals(10, dwarf.getHealthPoints());
    }

    @Test
    public void canAttackEnemy() {
        assertEquals("Swish Thwack!", dwarf.attack(troll));
        assertEquals(7, troll.getHealthPoints());
    }

    @Test
    public void canGetMultiplier() {
        assertEquals(2, dwarf.getMultiplier());
    }

    @Test
    public void canAttackWithMultiplier1() {
        Sword sword = new Sword();
        dwarf.changeWeapon(sword);
        dwarf.attack(troll);
        assertEquals(8, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        dwarf.takeDamage(1);
        assertEquals(9, dwarf.getHealthPoints());
    }

}
