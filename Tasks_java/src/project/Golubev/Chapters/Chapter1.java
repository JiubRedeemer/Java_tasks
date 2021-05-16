package project.Golubev.Chapters;

import project.Golubev.Geomerty.Line;
import project.Golubev.Weapons.Pistol;
import project.Golubev.Geomerty.Point;
import project.Golubev.Students.Student;

public class Chapter1 {
    public static void first() {
        System.out.println("\n\n1.1.1)Point:");

        Point A = new Point(1, 3);
        Point B = new Point(2, 5);
        Point C = new Point(6, 2);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }

    public static void second() throws Exception {
        System.out.println("\n\n1.2.1)Line:");

        Line A = new Line("A", new Point(1, 3), new Point(23, 8));
        Line B = new Line("B", new Point(5, 10), new Point(25, 10));
        Line C = new Line("C", A.start, B.end);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println();
        A.start.setX(3);
        A.start.setY(6);

        A.end.setX(13);
        A.end.setY(26);

        B.start.setX(23);
        B.start.setY(16);

        B.end.setX(63);
        B.end.setY(26);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println();

        A.start = new Point(22, 3);
        A.end = new Point(0, -3);
        B.start = new Point(11, 232);
        B.end = new Point(0, 0);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println();

    }

    public static void third() throws Exception {
        System.out.println("\n\n1.3.1)Student:");
        Student Vasya = new Student("Вася", 3,4,5);
        Student Petya = new Student("Петя", Vasya.marks);
        System.out.println(Vasya.toString());
        System.out.println(Petya.toString());
        Vasya.marks[0]=5;
        System.out.println(Vasya.toString());
        System.out.println(Petya.toString());
        Student Andrey = new Student("Андрей", Vasya.getMarks());
        System.out.println(Andrey.toString());
    }

    public static void fourth() throws Exception {
        System.out.println("\n\n1.4.1)Point:");
        Point A = new Point(3,5);
        Point B = new Point(25,6);
        Point C = new Point(7,8);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println("\n\n1.4.7)Student:");
        Student Vasya = new Student("Вася", 3,4,5);
        Student Max = new Student("Максим");
        System.out.println(Vasya.toString());
        System.out.println(Max.toString());
    }

    public static void fifth() throws Exception {
        System.out.println("\n\n1.5.1)Pistol:");
        Pistol glock = new Pistol(3);
        glock.shoot();
        glock.shoot();
        glock.shoot();
        glock.shoot();
        glock.shoot();
        System.out.println("\n\n1.5.6)Student:");
        Student Vasya = new Student("Вася", 3,4,5,4);
        Student Petya = new Student("Петя", 5,5,5,5);
        System.out.println(Vasya.average()+" Отличник: "+Vasya.isExcellent());
        System.out.println(Petya.average()+" Отличник: "+Petya.isExcellent());

    }

    public static void sixth(){
        System.out.println("\n\n1.6.5)Reload");
        Pistol glock = new Pistol(3,7);
        glock.shoot();
        glock.shoot();
        glock.shoot();
        glock.shoot();
        glock.shoot();
        glock.reload(8);
        glock.shoot();
        glock.shoot();
        glock.makeEmpty();
        glock.shoot();
    }
}
