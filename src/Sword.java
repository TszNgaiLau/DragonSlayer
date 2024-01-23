public class Sword {
    private int damage;
    private int dodge;

    public Sword() {
        damage = 10;
        dodge = 1;
    }
    public String updateSword() {
        damage += 5;
        dodge += 1;
        return "Your swords stats have been upgraded. Damage has increased by 5, and dodge rate by 1";
    }

    public int getDamage() {
        return damage;
    }
    public int getDodge() {
        return dodge;
    }
}
