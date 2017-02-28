package Unit02.homework.epum;

import org.junit.Test;

import static org.junit.Assert.*;

public class StarterPackTest {
    @Test
    public void testToString() throws Exception {
        StarterPack pack1 = new StarterPack();
        assertTrue(pack1.toString().contains("Pen"));
        assertTrue(pack1.toString().contains("Pencil"));
        assertTrue(pack1.toString().contains("Paper"));
        assertTrue(pack1.toString().contains("red"));
    }
}