import beings.Berserker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerserkerTest {

    Berserker berserker;

    @Before
    public void before() {
        berserker = new Berserker();
    }

    @Test
    public void hasFirstStrike2() {
        assertEquals(2, berserker.firstStrike());
    }

}
