package project.Golubev.Chapters;

import project.Golubev.Function;
import project.Golubev.Geomerty.Line;
import project.Golubev.Geomerty.Point;
import project.Golubev.Geomerty.Point3D;

import java.util.Arrays;

public class Chapter5 {
    public static void first() throws Exception {
        System.out.println("\n\n5.1.5)Line:");
        Line<Point3D, Point3D> A = new Line<Point3D, Point3D>("A", new Point3D(1, 2, 3), new Point3D(2, 67, 3));
        Line<Point, Point> B = new Line<Point, Point>("B", new Point(2, 3), new Point(67, 3));
        System.out.println(A.toString());
        System.out.println(B.toString());
    }

    public static void second() throws Exception {
        System.out.println("\n\n5.2.5)MoveLine:");
        Line<Point, Point> A = new Line<Point, Point>("A", new Point(1, 2), new Point(5, 2));
        System.out.println(A);
        Line.move(A);
        System.out.println(A);
    }

    public static void third(){
        System.out.println("\n\n5.3.1)Method:");
        System.out.println(Arrays.toString(Function.apply(new Object[]{1, -3, 6, -2})));
        System.out.println(Arrays.toString(Function.apply(new Object[]{"asd", "fasf32", "astgag", "saf"})));
        System.out.println(Arrays.toString(Function.apply(new Object[]{new int[]{1,2,3}, new int[]{7,2,-10}, new int[]{-1,-2,-3}})));
    }
}
