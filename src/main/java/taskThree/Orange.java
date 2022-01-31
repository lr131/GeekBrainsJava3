package taskThree;

public class Orange extends Fruit {
    private static final float WEIGHT = 1.5f;

    public Orange() {
        super(WEIGHT);
    }

    protected static boolean isParentclass() {
        return false;
    }
}
