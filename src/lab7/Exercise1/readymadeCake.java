package lab7.Exercise1;

public class readymadeCake extends Cake {
    private int quantity;

    public readymadeCake(String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return super.getRate() * this.getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "readymadeCake{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
