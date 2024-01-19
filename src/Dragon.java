public class Dragon {
    private double health;
    private int level;
    private int damage;

    public Dragon() {
        health = 100;


        level = (int) (Math.random() * 3) + 1;
        if (level == 3) {
            damage = 50;
        } else if (level == 2) {
            damage = 25;
        } else {
            damage = 10;
        }
    }

    public int dragonAttack() {
        return damage;
    }

    public void dragonHealth(int damage) {
        health -= damage;
    }

    public boolean isDead() {
        if (health == 0) {
            return true;
        }
        return false;
    }



}
