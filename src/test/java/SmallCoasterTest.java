import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import rides.SmallCoaster;

import static org.junit.Assert.assertEquals;

public class SmallCoasterTest {

    SmallCoaster smallCoaster;
    Customer customer;
    Customer customer2;
    Customer customer3;
    Customer customer4;

    @Before
    public void before(){
        smallCoaster = new SmallCoaster("Flying Unicorn", 100, 3.00, 4);
        customer = new Customer("Sarah", 157, 50.00);
        customer2 = new Customer("Rita", 153, 5.00);
        customer3 = new Customer("Davie", 100, 20.00 );
        customer4 = new Customer("Ella", 65, 3.00 );
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

    @Test
    public void hasCapacity(){
        assertEquals(4, smallCoaster.getCapacity());
    }

    @Test
    public void customerCanRide(){
        assertEquals(true, smallCoaster.customerCanRide(customer));
    }

    @Test
    public void customerCannotRideTooShort(){
        assertEquals(false, smallCoaster.customerCanRide(customer4) );
    }

    @Test
    public void customerCannotRideNotEnoughMoney(){
        assertEquals(false, smallCoaster.customerCanRide(customer4));
    }

    @Test
    public void canAddCustomer(){
        smallCoaster.addCustomerToRide(customer);
        assertEquals(1, smallCoaster.countCustomersOnRide());
    }

    @Test
    public void rideTakesCustomerMoney(){
        smallCoaster.addCustomerToRide(customer);
        assertEquals(47.00, customer.money, 0.01);
    }
}
