package project.Golubev.Collections;

import java.util.Arrays;

public class ConstArray {
    public int[] arr;
    int size=0;

    public ConstArray() {
    }


    public ConstArray(int[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public ConstArray(ConstArray constArray) {
        this.arr = constArray.arr;
        size = arr.length;
    }

    public int[] getArr() {
        return arr;
    }

    public int get(int index) {
        if (index > arr.length) throw new IndexOutOfBoundsException();
        else return arr[index];

    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
