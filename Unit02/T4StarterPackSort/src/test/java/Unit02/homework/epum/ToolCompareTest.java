package Unit02.homework.epum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ToolCompareTest {

    ToolCompare compare= new ToolCompare();
    @Test
    public void testCompareByName() throws Exception {
        StarterPack pack = new StarterPack();
        List<WritingTool> sortList=new ArrayList<WritingTool>(pack.getStarterPack());
        compare.compareByName(sortList);
        int listSize= sortList.size();
        assertTrue(sortList.get(1).getToolName().compareTo(sortList.get(2).getToolName()) <= 0 );
        assertTrue(sortList.get(listSize-2).getToolName().compareTo(sortList.get(listSize-1).getToolName()) <= 0 );
    }

    @Test
    public void testCompareByPrice() throws Exception {
        StarterPack pack = new StarterPack();
        List<WritingTool> sortList=new ArrayList<WritingTool>(pack.getStarterPack());
        compare.compareByPrice(sortList);
        int listSize= sortList.size();
        assertTrue(sortList.get(1).getToolPrice() <= sortList.get(2).getToolPrice() );
        assertTrue(sortList.get(listSize-2).getToolPrice() <= sortList.get(listSize-1).getToolPrice() );
    }

    @Test
    public void testCompareByNameAndPrice() throws Exception {
        StarterPack pack = new StarterPack();
        List<WritingTool> sortList=new ArrayList<WritingTool>(pack.getStarterPack());
        compare.compareByNameAndPrice(sortList);
        int listSize= sortList.size();

        boolean byName ;
        boolean byPrice;
        byName = sortList.get(1).getToolName().compareTo(sortList.get(2).getToolName()) <= 0;
        byPrice = sortList.get(1).getToolPrice() <= sortList.get(2).getToolPrice();
        assertTrue(byName||byPrice);
        byName = sortList.get(listSize-2).getToolName().compareTo(sortList.get(listSize-1).getToolName()) <= 0;
        byPrice = sortList.get(listSize-2).getToolPrice() <= sortList.get(listSize-1).getToolPrice();
        assertTrue(byName||byPrice );
    }

}