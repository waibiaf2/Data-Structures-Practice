package linear_structures;

public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
    }

    public void insert(int item) {
        /**
         * Check if the array is full,
         * If its full -> create a nother arrray double its size
         * Copy all the elements from the old array to the new array
         * Add the new item to the new array
         **/

        if (count == items.length) {
            int[] newItems = new int[items.length * 2];

            System.arraycopy(
                items, 0,
                newItems, 0,
                count
            );
            items = newItems;
            newItems[count++] = item;
        }

        items[count++] = item;
    }

    public int remove( int index) {
        return 0;
    }

    public int indexOf(int item){
        return 0;
    }

    public void print (){

    }

    public int size (){
        return count;
    }
}
