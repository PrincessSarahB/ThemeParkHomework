import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import rides.DropCoaster;
import rides.Ride;
import rides.Rollercoaster;
import rides.SmallCoaster;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    Customer customer3;
    Customer customer4;
    DropCoaster dropCoaster;
    SmallCoaster smallCoaster;
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        customer1 = new Customer("Bob", 182, 30.00, 35);
        customer2 = new Customer("Rita", 153, 5.00, 32);
        customer3 = new Customer("Davie", 100, 20.00, 10);
        customer4 = new Customer("Ella", 65, 3.00, 3);
        dropCoaster = new DropCoaster("Drop of Doom", 140, 5.00, 2);
        smallCoaster = new SmallCoaster("Flying Unicorn", 100, 3.00, 4);
        rollercoaster = new Rollercoaster("The Big One", 140, 6.00, 3);

    }
    @Test
    public void hasName(){
        assertEquals("Bob", customer1.getName());
    }

    @Test
    public void hasHeight(){
        assertEquals(182, customer1.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(30.00, customer1.getMoney(), 0.01);
    }

    @Test
    public void hasAge(){
        assertEquals(32, customer2.getAge());
    }

    @Test
    public void canChangeMoney(){
        customer1.setMoney(50.00);
        assertEquals(50.00, customer1.getMoney(), 0.01);
    }

    @Test
    public void meetsHeightRestriction(){
        assertEquals(true, customer1.meetsHeightRestriction(dropCoaster));
    }

    @Test
    public void doesNotMeetHeightRestriction(){
        assertEquals(false, customer4.meetsHeightRestriction(smallCoaster));
        assertEquals(false, customer3.meetsHeightRestriction(rollercoaster));
    }

    @Test
    public void canPay(){
        assertEquals(true, customer1.canPayForRide(rollercoaster));
    }

    @Test
    public void cannotPay(){
        assertEquals(false, customer4.canPayForRide(dropCoaster));
    }







}
