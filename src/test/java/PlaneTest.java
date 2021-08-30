import org.junit.Before;

public class PlaneTest {
    Plane plane;
    CabinCrewType cabinCrewType;


    @Before
    public void setUp() {
        plane = new Plane(1);
        cabinCrewType = new CabinCrewType("Sergio");


    }

}
