import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import rides.DropCoaster;

import static org.junit.Assert.assertEquals;

public class DropCoasterTest {
    DropCoaster dropCoaster;
    Customer customer;
    Customer customer2;
    Customer customer3;
    Customer customer4;

    @Before
    public void before(){
        dropCoaster = new DropCoaster("Drop of Doom", 140, 5.00, 2);
        customer = new Customer ("Sarah", 157, 50.00);
        customer2 = new Customer("Rita", 153, 5.00);
        customer3 = new Customer("Davie", 100, 20.00 );
        customer4 = new Customer("Ella", 65, 3.00 );
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

    @Test
    public void hasCapacity(){
        assertEquals(2, dropCoaster.getCapacity());
    }

    @Test
    public void customerCanRide(){
        assertEquals(true, dropCoaster.customerCanRide(customer));
    }

    @Test
    public void customerCannotRideTooShort(){
        assertEquals(false, dropCoaster.customerCanRide(customer4) );
    }

    @Test
    public void customerCannotRideNotEnoughMoney(){
        assertEquals(false, dropCoaster.customerCanRide(customer4));
    }

    @Test
    public void canAddCustomer(){
        dropCoaster.addCustomerToRide(customer);
        assertEquals(1, dropCoaster.countCustomersOnRide());
    }

    @Test
    public void rideTakesCustomerMoney(){
        dropCoaster.addCustomerToRide(customer);
        assertEquals(45.00, customer.money, 0.01);
    }


}
