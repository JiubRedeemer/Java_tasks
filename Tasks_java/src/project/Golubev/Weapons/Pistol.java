package project.Golubev.Weapons;

public class Pistol extends Weapon{
    private int bullets;
    private final int capacity;

    public Pistol(int bullets) {
        super(bullets);
        capacity = 5;
    }

    public Pistol(int bullets, int capacity) {
        super(bullets);
        this.capacity = capacity;
        if (bullets > capacity) {
            System.out.println(bullets - capacity + " лишних патронов");
        }
    }

    public Pistol() {
        super(5);
        this.capacity = 5;
    }

    public void shoot() {
        if(getAmmo()) System.out.println("Бах!");
        else System.out.println("Клац!");
    }

    public int reload(int ammo) {
        if (ammo < 0) {
            System.out.println("Кол-во патронов не может быть отрицательным");
            return -1;
        }
        if (ammo + bullets > capacity) {
            int excess = ammo + bullets - capacity;
            bullets = capacity;
            return excess;
        } else if (ammo + bullets <= capacity) {
            bullets += ammo;
            return 0;
        }
        return 0;
    }

    public void makeEmpty() {
        bullets = 0;
    }

    public boolean isEmpty() {
        return bullets <= 0;
    }

    public int ammo(){
        return bullets;
    }
}
