package project.Golubev.Weapons;

public class Automate extends Pistol {
    int fireRate;

    public Automate(int bullets, int fireRate) {
        super(bullets);
        this.fireRate = fireRate;
    }

    public Automate(int bullets, int capacity, int fireRate) {
        super(bullets, capacity);
        this.fireRate = fireRate;
    }

    public Automate() {
        super(30,30);
        fireRate = 30;
    }

    public Automate(int capacity){
        super(capacity);
        fireRate = capacity/2;
    }

    @Override
    public void shoot() {
        for(int i =0; i<fireRate; i++){
            super.shoot();
        }
    }

    public void shoot(int seconds) {
        for(int i =0; i<fireRate*seconds; i++){
            super.shoot();
        }
    }
}
