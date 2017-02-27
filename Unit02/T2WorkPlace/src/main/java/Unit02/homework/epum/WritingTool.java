package Unit02.homework.epum;

public class WritingTool {
    private String[] toolNames={"pen","pencil","rubber"};
    private String toolName;
    private double[] toolPrices={5,6,2};
    private double toolPrice;

    public WritingTool(String toolName) {
        for (int i = 0; i<toolNames.length; i++){
            if (toolName==toolNames[i]){
                this.toolName = toolName;
                this.toolPrice = toolPrices[i];
            }
        }
        if (this.toolName!=toolName){
            System.out.println(toolName+" - tool is unknown!");
            this.toolName = "Unknown";
            this.toolPrice = 0;
        }
    }

    public String getName() {
        return toolName;
    }

    public double getPrice() {
        return toolPrice;
    }
}
