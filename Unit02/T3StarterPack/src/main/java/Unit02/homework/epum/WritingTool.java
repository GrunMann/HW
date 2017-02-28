package Unit02.homework.epum;


public class WritingTool {
    private String toolName;
    private double toolPrice;

    public WritingTool(){

    }

    public String getToolName() {
        return toolName;
    }

    public double getToolPrice() {
        return toolPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WritingTool that = (WritingTool) o;

        if (Double.compare(that.toolPrice, toolPrice) != 0) return false;
        return toolName.equals(that.toolName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = toolName.hashCode();
        temp = Double.doubleToLongBits(toolPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "WritingTool{" +
                "toolName='" + toolName + '\'' +
                ", toolPrice=" + toolPrice +
                '}';
    }
}
