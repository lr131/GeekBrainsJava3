package taskThree;

public class Apple extends Fruit {
    private static final float WEIGHT = 1.0f;

    public Apple() {
        super(WEIGHT);
    }

    protected static boolean isParentclass() {
        return false;
    }
}