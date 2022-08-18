package lab6.Exercise1;

public class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        this.color = "Green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A Shape with color of %s and %s", this.getColor(),( this.isFilled() ? "" :"Not ")+ "filled");
    }
}
