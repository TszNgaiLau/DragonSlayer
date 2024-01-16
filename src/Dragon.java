public class Dragon {
    private double health;
    private int level;
    private int damage;

    public Dragon() {
        health = 100;
    }

    public void setDragonLevel() {
        int lev = (int) (Math.random() * 3) + 1;
        if (lev == 3) {
            level = 3;
        } else if (lev == 2) {
            level = 2;
        } else {
            level = 1;
        }
    }

    public int dragonAttack() {
        if (level == 3) {
            damage = 50;
        } else if (level == 2) {
            damage = 25;
        } else {
            damage = 10;
        }
        return damage;
    }

    public void dragonHealth(int damage) {
        health -= damage;
    }

    public String isDead() {
        if (health == 0) {
            int outcome = (int) (Math.random() * 4) + 1;
            if (outcome == 1) {
                if (level == 3) {
                    return "You got 50 gold!";
                } else if (level == 2) {
                    return "You got 25 gold!";
                } else {
                    return "You got 10 gold!";
                }
            } else if (outcome == 2) {
                Sword.updateSword();
                return "Your sword was upgraded!";
            }
        }
    }



}
