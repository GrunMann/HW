package Unit02.homework.epum.WritingTools;

import Unit02.homework.epum.WritingTool;


public class Pen extends WritingTool {
    private String toolName = "Pen";
    private double toolPrice;

    public Pen(double toolPrice) {
        this.toolPrice = toolPrice;

    }

    @Override
    public String getToolName() {
        return super.getToolName();
    }

    @Override
    public double getToolPrice() {
        return super.getToolPrice();
    }
}
