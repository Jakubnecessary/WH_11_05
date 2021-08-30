import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void setUp(){
        cabinCrew = new CabinCrew("Mark", "Coo-Pilot");

    }

    @Test
    public void hasName(){
        assertEquals("Mark",cabinCrew.getName());
    }
    @Test
    public void hasRank(){
        assertEquals( "Coo-Pilot", cabinCrew.getRank());
    }

}