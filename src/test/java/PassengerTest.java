import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        passenger = new Passenger("Rampage Johnson", 189, 2);
        passenger1 = new Passenger("Vasyli", 189, 2);
        passenger2 = new Passenger("Brad Bitt", 189, 2);
        passenger3 = new Passenger("Rampage Bonson", 189, 2);
    }
    @Test
    public void passengerHasName(){
        Assert.assertEquals("Rampage Johnson", passenger.getName());
        Assert.assertEquals("Vasyli", passenger1.getName());
        Assert.assertEquals("Brad Bitt", passenger2.getName());
        Assert.assertEquals("Rampage Bonson", passenger3.getName());
    }
}
