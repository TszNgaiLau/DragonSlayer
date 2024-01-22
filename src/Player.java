import java.util.Random;

public class Player {
    private int topScore;
    private int health;
    private int gold;
    private int highscore;
    private boolean healthPot;
    private Sword sword;
    private Dragon dragon;

    public Player() {
        highscore = 0;
        health = 100;
        gold = 0;
        healthPot = false;
        sword = new Sword();
    }

    public int getHighScore() {
        return highscore;
    }
    public int getRemainingDragons(int dragonsLefted) {

    }

    public int calculateHighScore() {
        int score =+ gold;
        dragon.

    }

    public void foundHealthPot() {
        if (!healthPot) {
            System.out.println("You already found an health pot, and you can only have one a time.");
        } else {
            healthPot = true;
        }
    }

    public boolean isDead() {
        if (health == 0) {
            return true;
        }
        return false;
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

    public String useHealthPot() {
        if (healthPot) {
            healthPot = false;
            health = 100;
            return "You have used the health pot";
        }
        return "You do not have a health pot";
    }

    public String getSword() {
        return "Sword|Damage: " + sword.getDamage() + "|Dodge: " + sword.getDodge() + "|";
    }

    public String getHealth() {
        return "Health: " + health;
    }






}
