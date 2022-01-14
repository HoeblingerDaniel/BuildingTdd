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

    @Test
    public void itShouldReturn1_AfterAddingDuplicateResident(){
        Building b = new Building(1234, "Test");
        b.addResident("Test");
        assertEquals(b.getNumberOfResidents(), 1);
    }

    @Test
    public void itShouldReturn2_GivenArrayOf2(){
        String[] residents = {"Test", "Test2"};
        assertEquals(new Building(1234, residents).getNumberOfResidents(), 2);
    }


}
