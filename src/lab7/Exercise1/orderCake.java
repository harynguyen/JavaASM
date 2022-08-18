package lab7.Exercise1;

public class orderCake extends Cake {
    private double weight;
    public orderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight = weight;//setter
    }
    @Override
    public double calcPrice() {
        return super.getRate() * this.getWeight();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "orderCake{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
