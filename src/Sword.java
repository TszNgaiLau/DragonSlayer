public class Sword {
    private String Sword;
    private int damage;
    private int dodge;

    public Sword() {
        Sword = "Sword";
        damage = 10;
        dodge = 1;
    }
    public void updateSword() {
        damage += 5;
        dodge += 1;
    }

    public int getDamage() {
        return damage;
    }
    public int getDodge() {
        return dodge;
    }
}
