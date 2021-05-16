package project.Golubev.Chapters;

import project.Golubev.Weapons.Automate;
import project.Golubev.Weapons.Pistol;
import project.Golubev.Geomerty.Point;
import project.Golubev.Weapons.Shooter;

public class Chapter3 {
    public static void first() {
        System.out.println("\n\n3.1.5)Automate:");
        Automate ak47 = new Automate(25, 30, 10);
        ak47.shoot(3);
    }

    public static void second() {
        System.out.println("\n\n3.3.8)Shooter:");

        Shooter Nikita = new Shooter("Никита", new Pistol(10, 20));
        Shooter Vlad = new Shooter("Влад", new Automate(20, 30, 5));
        Shooter Artem = new Shooter("Артем");
        Nikita.shoot();
        Vlad.shoot();
        Artem.shoot();
    }

    public static void third() {
        System.out.println("\n\n3.4.2)EqualPoints:");
        Point A = new Point(1,2);
        Point B = new Point(1,2);
        Point C = new Point(0,8);
        System.out.println(A.equals(B));
        System.out.println(A.equals(C));
    }

}
