package Unit02.homework.epum;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkPlaceTest {
    @Test
    public void addToWorkplace() throws Exception {
        WorkPlace place = new WorkPlace();
        place.addToWorkplace("pen");
        place.addToWorkplace("pencil");
        place.addToWorkplace("paper");
        assertTrue(place.getWorkToolsList().contains("pen"));
        assertTrue(place.getWorkToolsList().contains("pencil"));
        assertFalse(place.getWorkToolsList().contains("paper"));
    }

    @Test
    public void removeFromWorkplace() throws Exception {
        WorkPlace place = new WorkPlace();
        place.addToWorkplace("pen");
        place.addToWorkplace("pencil");
        place.addToWorkplace("paper");
        assertTrue(place.getWorkToolsList().contains("pen"));
        place.removeFromWorkplace("pen");
        assertFalse(place.getWorkToolsList().contains("pen "));
        assertTrue(place.getWorkToolsList().contains("pencil"));
        assertFalse(place.getWorkToolsList().contains("paper"));
        place.removeFromWorkplace("paper");
        assertFalse(place.getWorkToolsList().contains("paper"));
    }

    @Test
    public void getWorkToolsList() throws Exception {
        WorkPlace place = new WorkPlace();
        place.addToWorkplace("pen");
        place.addToWorkplace("pencil");
        place.addToWorkplace("paper");
        assertTrue(place.getWorkToolsList().equals("pen pencil Unknown "));
        place.removeFromWorkplace("pen");
        assertTrue(place.getWorkToolsList().equals("pencil Unknown "));

    }

    @Test
    public void getWorkToolsCost() throws Exception {
        WorkPlace place = new WorkPlace();
        place.addToWorkplace("pen");
        place.addToWorkplace("pencil");
        place.addToWorkplace("paper");
        assertTrue(place.getWorkToolsCost()==11);
        place.removeFromWorkplace("pen");
        assertTrue(place.getWorkToolsCost()==6);
    }

}