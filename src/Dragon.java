public class Dragon {
    private int health;
    private int level;
    private int damage;

    public Dragon() {
        health = 100;
        level = (int) (Math.random() * 3) + 1;
        if (level == 3) {
            damage = 10;
        } else if (level == 2) {
            damage = 5;
        } else {
            damage = 3;
        }
    }
    public int getLevel() {
        return level;
    }

    public int dragonAttack() {
        return damage;
    }

    public void dragonHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("You attack the dragon for " + damage + " health. It has been slain");
        } else {
            System.out.println("You attack the dragon for " + damage + " health. It has " + health + " remaining");
        }

    }

    public boolean isDead() {
        if (health <= 0) {
            return true;
        }
        return false;
    }



}
