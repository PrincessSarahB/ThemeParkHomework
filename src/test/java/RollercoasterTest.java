import org.junit.Before;
import org.junit.Test;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Big One", 140, 6.00, 3);
    }

    @Test
    public void hasName(){
        assertEquals("The Big One", rollercoaster.getName());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(140, rollercoaster.getMinHeight());
    }

    @Test
    public void hasPrice(){
        assertEquals(6.00, rollercoaster.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, rollercoaster.getCapacity());
    }
}
