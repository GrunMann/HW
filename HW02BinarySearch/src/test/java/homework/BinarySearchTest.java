package homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void getMid() throws Exception {
        BinarySearch tree1 = new BinarySearch(new int[]{1, 2, 4, 5});
        BinarySearch tree2= new BinarySearch(new int[]{0, 4000, 4000, 34433,50000});
        assertTrue(tree1.getMid() == 1);
        assertFalse(tree1.getMid() == 4);
        assertTrue(tree2.getMid() == 2);
    }

    @Test
    public void consist() throws Exception {
        BinarySearch tree1 = new BinarySearch(new int[]{1, 2, 4, 5});
        BinarySearch tree2= new BinarySearch(new int[]{0, 4000, 4000, 34433,50000});
        for (int i=0; i<5; i++){
            if (i ==1 || i==2 || i==4 || i==5){
                assertTrue(tree1.consist(i));
            }else{
                assertFalse(tree1.consist(i));
            }
        }
        assertTrue(tree2.consist(0));
    }

    @Test
    public void getElementLevelInTree() throws Exception {
        BinarySearch tree1 = new BinarySearch(new int[]{1, 2, 4, 5});
        BinarySearch tree2= new BinarySearch(new int[]{0, 4000, 4000, 34433,50000});
        assertTrue(tree1.getElementLevelInTree(1)==2);
        assertTrue(tree1.getElementLevelInTree(2)==1);
        assertTrue(tree2.getElementLevelInTree(34433)==2);
    }

    @Test
    public void generateSortedBinaryTree() throws Exception {
        BinarySearch tree1 = new BinarySearch(5);
        BinarySearch tree2 = new BinarySearch(50);
        BinarySearch tree3 = new BinarySearch(100);
        for (int i=0; i<tree1.getLength()-1; i++){
            assertTrue(tree1.getValueByID(i)<tree1.getValueByID(i+1));
        }
        for (int i=0; i<tree2.getLength()-1; i++){
            assertTrue(tree2.getValueByID(i)<tree2.getValueByID(i+1));
        }
        for (int i=0; i<tree3.getLength()-1; i++){
            assertTrue(tree3.getValueByID(i)<tree3.getValueByID(i+1));
        }
    }

    @Test
    public void getLength() throws Exception {
        BinarySearch tree1 = new BinarySearch(new int[]{1, 2, 4, 5});
        BinarySearch tree2= new BinarySearch(new int[]{0, 4000, 4000, 34433,50000});
        assertTrue(tree1.getLength() == 4);
        assertTrue(tree2.getLength() == 5);
    }

    @Test
    public void getValueByID() throws Exception {
        BinarySearch tree1 = new BinarySearch(new int[]{1, 2, 4, 5});
        BinarySearch tree2= new BinarySearch(new int[]{0, 4000, 4000, 34433,50000});
        assertTrue(tree1.getValueByID(0) == 1);
        assertTrue(tree2.getValueByID(0) == 0);
    }

}
