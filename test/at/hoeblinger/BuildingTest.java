package at.hoeblinger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    @Test
    public void itShouldReturn1234_Given1234() {
        assertEquals(new Building(1234, "test").id, 1234);
    }
}
