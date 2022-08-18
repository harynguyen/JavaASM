package lab6.Exercise1;

public class Rectangle extends Shape {
    private double width, length;
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(){
        width = length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return  2 * (this.width + this.length);
    }
    public String toString() {
        return String.format("A Rectangle with width = %.2f and length = %.2f, " +" which is a subclass of %s", this.width, this.length, super.toString());
    }
}
