package taskThree;

import java.util.ArrayList;

/**
 * Класс Box в который можно складывать фрукты,
 * коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 */
public class Box<T extends Fruit> {
    /**
     * Для хранения фруктов внутри коробки можете использовать ArrayList;
     */
    private ArrayList<T> array;

    public Box() {
        if (!T.isParentclass()) {
            this.array = new ArrayList<T>();
        } else {
            System.err.println("В коробке должны лежать фрукты определенного типа!");
        }
    }

    public Box(int count) {
        if (!T.isParentclass()) {
            this.array = new ArrayList<T>(count);
        } else {
            System.err.println("В коробке должны лежать фрукты определенного типа!");
        }
    }


    /**
     * Не забываем про метод добавления фрукта в коробку.
     * @param fruit фрукт, который нужно добавить
     */
    public void add(T fruit) {
        if (!fruit.isParentclass()) {
            this.array.add(fruit);
            System.out.println("Фрукт добавлен");
        } else {
            System.err.println("В коробку можно положить фрукт только определенного типа!");
        }
    }

    public void addAll(ArrayList<T> fruits) {
        if (!T.isParentclass()) {
            this.array.addAll(fruits);
            System.out.println("Фрукты добавлены");
        } else {
            System.err.println("В коробку можно положить фрукты только определенного типа!");
        }
    }

    /**
     *  Сделать метод getWeight() который высчитывает вес коробки,
     *  зная количество фруктов и вес одного фрукта
     *  (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * @return вес коробки
     */
    public double getWeight() {
        return array.size() * this.array.get(0).getWeight();
    }

    /**
     * Внутри класса коробка сделать метод compare,
     * который позволяет сравнить текущую коробку с той,
     * которую подадут в compare в качестве параметра
     * (коробки с яблоками мы можем сравнивать с коробками с апельсинами)
     *
     * @param boxOther коробка, с которой сравнивается текущая
     * @return {@code true} веса равны
     *         {@code false} веса не равны
     */
    public boolean compare(Box<?> boxOther) {
        return this.getWeight() == boxOther.getWeight();
    }

    /**
     * Написать метод, который позволяет пересыпать фрукты из текущей коробки
     * в другую коробку(помним про сортировку фруктов,
     * нельзя яблоки высыпать в коробку с апельсинами),
     * соответственно в текущей коробке фруктов не остается,
     * а в другую перекидываются объекты, которые были в этой коробке;
     * @param targetBox коробка, в которую нужно пересыпать текущую.
     */
    public void move(Box<T> targetBox) {
        if (this.getWeight() == 0) {
            //текущая коробка пуста, нечего пересыпать
            return;
        }
        targetBox.addAll(this.array);
        this.array.clear();

    }
}