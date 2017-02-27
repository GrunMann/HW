package Unit02.homework.epum;

public class Pen {

    private String colour;
    private double price;

    public Pen(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {

        return colour;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Pen pen = (Pen) object;

        if (Double.compare(pen.price, price) != 0) return false;
        return colour.equals(pen.colour);
    }
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + colour.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
