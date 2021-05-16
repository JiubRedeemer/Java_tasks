package project.Golubev.Collections;

import java.util.Arrays;

public class ConstLengthArray {
    public int[] arr;
    int size = 0;
    private int maxLength;

    public ConstLengthArray(int...arr) {
        this.arr = arr;
        size = arr.length;
        maxLength = arr.length;
    }

    public ConstLengthArray() {
        maxLength = 100;
        arr = new int[maxLength];
    }

    public ConstLengthArray(int length) {
        arr = new int[length];
        maxLength = length;
    }

    public ConstLengthArray(ConstLengthArray constLengthArray) {
        this.arr = constLengthArray.arr;
        size = constLengthArray.size;
        maxLength = constLengthArray.length();
    }

    public void add(int a) {
        if (size >= maxLength) throw new IndexOutOfBoundsException();
        else {
            arr = Arrays.copyOf(arr, maxLength);
            arr[size] = a;
            size++;
        }
    }

    public void add(int[] a) {
        if (size + a.length >= maxLength) throw new IndexOutOfBoundsException();
        else for (int j : a) this.add(j);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        if(arr!=null){
        this.arr = Arrays.copyOf(arr, maxLength);
        size = arr.length;}
    }

    public void set(int index, int value) {

        if (size + 1 > maxLength) throw new IndexOutOfBoundsException();
        else {

            size++;
            arr = Arrays.copyOf(arr, maxLength);

            for(int i =size; i>index;i--){
                arr[i] = arr[i-1];
            }
            arr[index] = value;
        }
    }

    public void set(int index, int[] value) {
        int startPos = index;
        if (index + value.length >= maxLength) throw new IndexOutOfBoundsException();
        else for (int j : value) {
            set(startPos, j);
            startPos++;
        }
    }

    public void remove(int index) {
        if (index > maxLength || index < 0) throw new IndexOutOfBoundsException();
        if(index == size-1) arr = Arrays.copyOf(arr, size-1);
        else
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
            size--;
        }
    }

    public int get(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        else{ return arr[index];}

    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public int length() {
        return arr.length;
    }

    @Override
    public String toString() {
        arr = Arrays.copyOf(arr, size);
        return Arrays.toString(arr);
    }
}
