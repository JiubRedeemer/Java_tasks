package project.Golubev.Chapters;

import project.Golubev.Collections.ChangeableArray;
import project.Golubev.Collections.ConstArray;
import project.Golubev.Collections.ConstLengthArray;
import project.Golubev.Students.StudentWithChangeableArray;

public class Chapter2 {
    public static void first() {
        System.out.println("\n\n2.1.1)ConstArray:");
        ConstArray a = new ConstArray(new int[]{1, 2, 3, 4, 5});
        ConstArray b = new ConstArray(a);
        System.out.println(a.toString());
        System.out.println("Размер массива A: " + a.length());
        System.out.println(b.toString());
        System.out.println("Пуст ли массив B: " + b.isEmpty());
        ConstArray c = new ConstArray();
        System.out.println(c.toString());
        System.out.println("Пуст ли массив С: " + c.isEmpty());


    }

    public static void second() {
        System.out.println("\n\n2.1.2)ConstLengthArray:");
        ConstLengthArray a = new ConstLengthArray(new int[]{1, 2, 3, 4, 5});
        ConstLengthArray b = new ConstLengthArray(a);
        System.out.println(a.toString());
        System.out.println("Размер массива A" + a.length());
        System.out.println(b.toString());
        System.out.println("Пуст ли массив B: " + b.isEmpty());
        ConstLengthArray c = new ConstLengthArray();
        System.out.println(c.toString());
        System.out.println("Пуст ли массив С: " + c.isEmpty());
        ConstLengthArray d = new ConstLengthArray(13);
        d.add(4);
        d.add(new int[]{3,5,1});
        System.out.println(d.toString());
        d.remove(2);
        System.out.println(d.toString());

    }

    public static void third(){
        System.out.println("\n\n2.1.3)ConstLengthArray:");
        ChangeableArray a = new ChangeableArray(new int[]{1, 2, 3, 4, 5});
        ChangeableArray b = new ChangeableArray(a);
        System.out.println(a.toString());
        System.out.println("Размер массива A: " + a.length());
        System.out.println(b.toString());
        System.out.println("Пуст ли массив B: " + b.isEmpty());
        ChangeableArray c = new ChangeableArray();
        System.out.println(c.toString());
        System.out.println("Пуст ли массив С: " + c.isEmpty());
        ChangeableArray d = new ChangeableArray();
        d.add(4);
        d.add(new int[]{3,5,1});
        System.out.println(d.toString());
        d.remove(3);
        System.out.println(d.toString());
    }

    public static void fourth() throws Exception {
        System.out.println("\n\n2.2.1)StudentWithChangeableArray");
        StudentWithChangeableArray Alex = new StudentWithChangeableArray("Алекс", new int[]{2,3,4});
        System.out.println(Alex.toString());
    }

}
