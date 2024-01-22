import java.sql.SQLOutput;
import java.util.Random;

public class Player {
    private int topScore;
    private int health;
    private int gold;
    private int highscore;
    private boolean healthPot;
    private Sword sword;
    private Dragon dragon;
    public int dragonLeft;

    public Player() {
        highscore = 0;
        health = 100;
        gold = 0;
        healthPot = false;
        sword = new Sword();
        dragon = new Dragon();
    }

    public int getHighScore() {
        return highscore;
    }
    public void getRemainingDragons(int dragonsLefted) {
        dragonLeft = dragonsLefted;
        dragonLeft = 5 - dragonLeft;
    }

    public void calculateHighScore() {
        int score = 0;
        score += gold;
        if (dragonLeft == 0) {
            dragonLeft *= score;
        }
        if (score > highscore) {
            highscore = score;
        }
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
            System.out.println("You dodge the attack from the dragon!!!");
        } else if (sword.getDodge() == dodge) {
            if (dragon.dragonAttack() % 2 != 0) {
                health -= (dragon.dragonAttack() + 1) / 2;
                System.out.println("You barely dodge the attack and lost " + (dragon.dragonAttack() + 1) / 2 + " health.");
            } else {
                health -= dragon.dragonAttack() / 2;
                System.out.println("You barely dodge the attack and lost " + dragon.dragonAttack() / 2 + " health.");
            }
        } else {
            health -= dragon.dragonAttack();
            System.out.println("You failed to dodge the attack and lost " + dragon.dragonAttack() / 2 + " health.");
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
