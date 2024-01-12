import java.util.Random;

public class Player {
    private int health;
    private int gold;
    private double highscore;
    private boolean healthPot;
    private Sword sword;
    private Dragon dragon;

    public Player() {
        health = 100;
        gold = 0;
        healthPot = false;
        sword = new Sword();
        dragon = new Dragon();
    }

    public int attack() {
        int crit = (int) (Math.random() * 3) + 1;
        if (crit == 1) {
            return sword.getDamage() + 5;
        }
        return sword.getDamage();
    }
    public void dodge() {
        int dodge = (int) (Math.random() * 10) + 1;
        if (sword.getDodge() > dodge) {
            health -= 0;
        } if (sword.getDodge() == dodge) {
            if (dragon.dragonAttack() % 2 != 0) {
                health -= (dragon.dragonAttack() + 1) / 2;
            } else {
                health -= dragon.dragonAttack() / 2;
            }
        }
    }





}
