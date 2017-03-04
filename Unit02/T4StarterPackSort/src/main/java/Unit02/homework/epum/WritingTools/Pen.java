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
        return toolName;
    }

    @Override
    public double getToolPrice() {
        return toolPrice;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "toolPrice=" + toolPrice +
                '}';
    }
}
