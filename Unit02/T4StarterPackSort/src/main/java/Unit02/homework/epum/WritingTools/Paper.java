package Unit02.homework.epum.WritingTools;

import Unit02.homework.epum.WritingTool;


public class Paper extends WritingTool {
    private String toolName="Paper";
    private double toolPrice;
    public Paper(double toolPrice) {
        this.toolPrice = toolPrice;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "toolPrice=" + toolPrice +
                '}';
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
