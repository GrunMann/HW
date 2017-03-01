package Unit02.homework.epum;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToolCompare {
    public void compareByName(List<WritingTool> starterPack){
        Comparator<WritingTool> comparator = new Comparator<WritingTool>() {
            @Override
            public int compare(WritingTool o1, WritingTool o2) {
                return o1.getToolName().compareTo(o2.getToolName());
            }
        };
        Collections.sort(starterPack,comparator);
    }
    public void compareByPrice(List<WritingTool> starterPack){
        Comparator<WritingTool> comparator = new Comparator<WritingTool>() {
            @Override
            public int compare(WritingTool o1, WritingTool o2) {
                return Double.compare(o1.getToolPrice(),o2.getToolPrice());
            }
        };
        Collections.sort(starterPack,comparator);
    }
    public void compareByNameAndPrice(List<WritingTool> starterPack){
        Comparator<WritingTool> comparator = new Comparator<WritingTool>() {
            @Override
            public int compare(WritingTool o1, WritingTool o2) {
                if (Double.compare(o1.getToolPrice(),o2.getToolPrice())==0){
                    return o1.getToolName().compareTo(o2.getToolName());
                }else{
                    return Double.compare(o1.getToolPrice(),o2.getToolPrice());
                }
            }
        };
        Collections.sort(starterPack,comparator);
    }

}
