package lab7.Exercise1;

public abstract class Cake {
    protected String name;
    protected double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Cake(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    public abstract double calcPrice();
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
