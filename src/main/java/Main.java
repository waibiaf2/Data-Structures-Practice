import linear_structures.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array items = new Array(5);
        items.add(10);
        items.add(15);
        items.add(22);
        items.add(35);
        items.add(45);
        items.add(55);
        items.add(88);
        items.add(99);
        items.add(77);
        items.add(66);


        items.print();

        items.removeAt(1);
        items.removeAt(4);
        items.removeAt(items.size() - 1);
        items.removeAt(items.size() - 1);
        items.print();
        System.out.println(items.size());


    }
}
