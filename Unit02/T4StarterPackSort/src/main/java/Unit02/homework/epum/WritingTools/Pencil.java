package Unit02.homework.epum.WritingTools;

import Unit02.homework.epum.WritingTool;


public class Pencil extends WritingTool{
    private String toolName="Pencil";
    private double toolPrice;

    public Pencil(double toolPrice) {
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
        return "Pencil{" +
                "toolPrice=" + toolPrice +
                '}';
    }
}
