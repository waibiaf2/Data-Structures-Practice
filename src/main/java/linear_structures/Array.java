package linear_structures;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
    }

    public void add(int item) {
        /**
         * Check if the array is full,
         * If its full -> create another array double its size
         * Copy all the elements from the old array to the new array
         * Add the new item to the new array
         **/
        if (count == items.length) {
            int[] newItems = new int[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, count);
            newItems[count++] = item;
            items = newItems;
            return;
        }

        items[count++] = item;
    }

    public void removeAt( int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException("Index out of bounds");

        for(int i = index; i < count - 1  ; i++) {
            items[i] = items[i + 1];
        }

        items = reduceArraySize();

        count--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (items[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void print (){
        System.out.println(Arrays.toString(items));
    }

    public int size (){
        return count;
    }

    private int[] reduceArraySize() {
        var newItems = new int[count - 1];
        System.arraycopy(items, 0, newItems, 0, count - 1);
        return newItems;
    }
}
