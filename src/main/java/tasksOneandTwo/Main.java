package tasksOneandTwo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Task 1:
         * Написать метод, который меняет два элемента массива местами.
         * (массив может быть любого ссылочного типа);
         */
        System.out.println(" Написать метод, который меняет два элемента массива местами:");
        ArrayGeneric<Integer> arr = new ArrayGeneric<>(1,2,3,4);
        arr.print();
        arr.swap(0,2);
        arr.print();

        /**
         * Task 2:
         * Написать метод, который преобразует массив в ArrayList.
         */
        System.out.println("\nНаписать метод, который преобразует массив в ArrayList:");
        ArrayList<Integer> arrayList = arr.convertToArrayList();
        System.out.println(arrayList.getClass());
    }
}
