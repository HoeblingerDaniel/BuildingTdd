package at.hoeblinger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    @Test
    public void itShouldReturn1234_Given1234() {
        assertEquals(new Building(1234, "test").id, 1234);
    }

    @Test
    public void itShouldReturnTest_GivenTest(){
        assertEquals(new Building(1234, "Test").residents.get(0), "Test");
    }

    @Test
    public void itShouldReturn1_Given1Resident(){
        assertEquals(new Building(1234, "Test").getNumberOfResidents(), 1);
    }

    @Test
    public void itShouldReturn2_AfterAddingResident(){
        Building b = new Building(1234, "Test");
        b.addResident("Test2");
        assertEquals(b.getNumberOfResidents(), 2);
    }


}
