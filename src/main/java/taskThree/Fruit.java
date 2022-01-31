package taskThree;

public abstract class Fruit {
    private double weight;

    public double getWeight() {
        return this.weight;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    protected static boolean isParentclass() {
        return true;
    }
}
