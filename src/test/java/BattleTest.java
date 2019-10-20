import abilities.Axe;
import beings.Dwarf;
import beings.Troll;
import gameplay.Battle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    Axe myAxe;
    Dwarf player;
    Troll troll;
    Battle battle;


    @Before
    public void before() {
        myAxe = new Axe();
        player = new Dwarf("Gimli", myAxe);
        troll = new Troll();
        battle = new Battle(player, troll);
    }

    @Test
    public void hasPlayer() {
        assertEquals(player, battle.getPlayer());
    }

    @Test
    public void hasEnemy() {
        assertEquals(troll, battle.getEnemy());
    }

    @Test
    public void canTradeBlows() {
        battle.tradeBlows();
        assertEquals(7,battle.getEnemy().getHealthPoints());
    }

}
