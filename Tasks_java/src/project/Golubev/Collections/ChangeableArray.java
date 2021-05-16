package project.Golubev.Collections;

import java.util.Arrays;

public class ChangeableArray {
    public int[] arr = new int[1];
    private int size = 0;

    public ChangeableArray(int[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public ChangeableArray() {
    }

    public ChangeableArray(ChangeableArray changeableArray) {
        this.arr = changeableArray.arr;
        size = changeableArray.size;
    }

    public void add(int a) {
        this.arr = Arrays.copyOf(this.arr, size+1);
        arr[size] = a;
        size++;

    }

    public void add(int[] a) {
        for (int j : a) this.add(j);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
        size = arr.length;
    }

    public void set(int index, int value) {

        size++;
        arr = Arrays.copyOf(arr, size);

        if (size - index >= 0) System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = value;

    }

    public void set(int index, int[] value) {
        int startPos = index;
        for (int j : value) {
            set(startPos, j);
            startPos++;
        }
    }

    public void remove(int index) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException();
        if(index == size-1) arr = Arrays.copyOf(arr, size-1);
        else
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
            size--;
        }
    }

    public int get(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        else {
            return arr[index];
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
