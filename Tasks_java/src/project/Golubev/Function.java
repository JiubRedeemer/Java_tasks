package project.Golubev;

import java.util.Arrays;

public class Function {

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static <T> Object[] apply(T[] o) {
        Object[] P = new Object[1];
        P = Arrays.copyOf(P, o.length);
        int flag = 0;
        for (T t : o) {
            if (t.getClass() == String.class) {
                flag += 1;
            }
            if (t.getClass() == Integer.class) {
                flag += 2;
            }
            if (t.getClass() == int[].class) {
                flag += 3;
            }
        }

        flag = flag / o.length;

        switch (flag) {
            case 1 -> {
                for (int i = 0; i < o.length; i++)
                    P[i] = o[i].toString().length();
                P = Arrays.copyOf(P, o.length);
                return P;
            }
            case 2 -> {
                for (int i = 0; i < o.length; i++)
                    P[i] = Math.abs((Integer) o[i]);
                P = Arrays.copyOf(P, o.length);
                return P;
            }
            case 3 -> {
                for (int i = 0; i < o.length; i++) {
                    P[i] = Function.max((int[]) o[i]);
                }
                P = Arrays.copyOf(P, o.length);
                return P;
            }
            default -> {
                return P;
            }
        }
    }

}
