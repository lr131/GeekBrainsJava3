package taskThree;

public class Main {

    /**
     * Большая задача
     */
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(5);
        Box<Orange> orangeBox = new Box<>(4);
        Apple apple = new Apple();
        Orange orange = new Orange();

        appleBox.add(apple);
        orangeBox.add(orange);
//        orangeBox.add(apple); // не дает, ругается, т.к. другой тип
//        Box<Fruit> fruitBox = new Box<>();
//        fruitBox.add(orange);
//        fruitBox.add(apple);
        System.out.println(appleBox.compare(orangeBox));


    }
}