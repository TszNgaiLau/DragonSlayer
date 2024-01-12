public class Dragon {
    private double health;
    private int level;
    private int damage;

    public Dragon() {
        health = 100;
    }

    public void setDragonLevel() {
        int lev = (int) (Math.random() * 2) + 1;
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

}
