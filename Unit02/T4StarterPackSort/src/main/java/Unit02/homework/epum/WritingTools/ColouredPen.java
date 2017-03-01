package Unit02.homework.epum.WritingTools;

import Unit02.homework.epum.WritingTool;

public class ColouredPen extends WritingTool {
    private String toolName="Red Pen";
    private double toolPrice;
    private String colour;
    public ColouredPen(double toolPrice, String colour) {
        this.colour=colour;
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

    @Override
    public String toString() {
        return "ColouredPen{" +
                "toolPrice=" + toolPrice +
                ", colour='" + colour + '\'' +
                '}';
    }
}
