import org.junit.Before;
import org.junit.Test;
import rides.DropCoaster;

import static org.junit.Assert.assertEquals;

public class DropCoasterTest {
    DropCoaster dropCoaster;

    @Before
    public void before(){
        dropCoaster = new DropCoaster("Drop of Doom", 140, 5.00);
    }

    @Test
    public void hasName(){
        assertEquals("Drop of Doom", dropCoaster.getName());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(140, dropCoaster.getMinHeight());
    }

    @Test
    public void hasPrice(){
        assertEquals(5.00, dropCoaster.getPrice(), 0.01);
    }


}
