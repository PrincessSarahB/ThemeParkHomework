import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Customer customer;
    Customer customer2;
    Customer customer3;
    Customer customer4;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Big One", 140, 6.00, 3);
        customer = new Customer("Sarah", 157, 50.00);
        customer2 = new Customer("Rita", 153, 5.00);
        customer3 = new Customer("Davie", 100, 20.00 );
        customer4 = new Customer("Ella", 65, 3.00 );
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

    @Test
    public void customerCanRide(){
        assertEquals(true, rollercoaster.customerCanRide(customer));
    }

    @Test
    public void customerCannotRideTooShort(){
        assertEquals(false, rollercoaster.customerCanRide(customer4) );
    }

    @Test
    public void customerCannotRideNotEnoughMoney(){
        assertEquals(false, rollercoaster.customerCanRide(customer2));
    }

    @Test
    public void canAddCustomer(){
        rollercoaster.addCustomerToRide(customer);
        assertEquals(1, rollercoaster.countCustomersOnRide());
    }

    @Test
    public void rideTakesCustomerMoney(){
        rollercoaster.addCustomerToRide(customer);
        assertEquals(44.00, customer.money, 0.01);
    }


}
