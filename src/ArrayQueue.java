/**
 * @author YorkIsMine (AshenKen)
 * <p>
 * Complexity of Data Structure:
 * 1. enqueue():
 * O(n) - worst case
 * Θ(1) - average case
 * Ω(1) - best case
 * ___________________________
 * 2. dequeue():
 * O(1) - worst case
 * Θ(1) - average case
 * Ω(1) - best case
 * ___________________________
 * 3. peek():
 * O(1) - worst case
 * Θ(1) - average case
 * Ω(1) - best case
 * ___________________________
 * 4. size():
 * O(1) - worst case
 * Θ(1) - average case
 * Ω(1) - best case
 */

public class ArrayQueue<T> {
    private T[] arr = (T[]) new Object[10];
    /**
     * size of notNull elements
     */
    private int size = 0;
    /**
     * length of array (can include null elements)
     */
    private int capacity = 10;
    /**
     * index of deleted element, which detect the head of queue
     */
    private int indexForDe = 0;
    /**
     * need for detecting the tail
     */
    private int lastElem = 0;

    public void enqueue(T item) {
        if (lastElem == capacity) {
            capacity = (int) (capacity * 1.5);
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < lastElem; i++)
                newArr[i] = arr[i];
            arr = newArr;
        }

        arr[lastElem] = item;
        lastElem++;
        size++;
    }

    public T dequeue() {
        T param = arr[indexForDe];
        arr[indexForDe] = null;
        size--;
        indexForDe++;

        return param;
    }

    public T peek() {
        return arr[indexForDe];
    }

    public int size() {
        return size;
    }


}