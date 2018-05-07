import org.junit.Before;
import org.junit.Test;
import rides.SmallCoaster;

import static org.junit.Assert.assertEquals;

public class SmallCoasterTest {

    SmallCoaster smallCoaster;

    @Before
    public void before(){
        smallCoaster = new SmallCoaster("Flying Unicorn", 100, 3.00);
    }

    @Test
    public void hasName(){
        assertEquals("Flying Unicorn", smallCoaster.getName());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(100, smallCoaster.getMinHeight());
    }

    @Test
    public void hasPrice(){
        assertEquals(3.00, smallCoaster.getPrice(), 0.01);
    }
}
