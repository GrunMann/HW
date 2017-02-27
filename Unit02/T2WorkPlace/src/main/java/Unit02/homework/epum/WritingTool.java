package Unit02.homework.epum;

public class WritingTool {
    private String[] toolNames={"pen","pencil","rubber"};
    private String toolName;
    private double[] toolPrices={5,6,2};
    private double toolPrice;

    public WritingTool(String toolName) {
        for (int i = 0; i<toolName.length(); i++){
            if (toolName==toolNames[i]){
                this.toolName = toolName;
                this.toolPrice = toolPrices[i];
            }
        }
        if (this.toolName!=toolName){
            System.out.println("This tool is unknown!");
            this.toolName = "Unknown_"+toolName;
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
