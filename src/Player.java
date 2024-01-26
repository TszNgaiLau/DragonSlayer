import java.sql.SQLOutput;
import java.util.Random;

public class Player {

    private double health;
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
    }
    public Sword swordStat() {
        return sword;
    }
    public boolean isDead() {
        if (health <= 0) {
            return true;
        }
        return false;
    }

    public String setGold(int level) {
        if (level == 3) {
            gold += 10;
            return "You gained 10 gold for killing the dragon.";
        } else if (level == 2) {
            gold += 5;
            return "You gained 5 gold for killing the dragon.";
        } else {
            gold += 3;
            return "You gained 3 gold for killing the dragon.";
        }

    }
    public String gainHealth(int level) {
        double gain = 100 - health;
        if (health != 100) {
            if (level == 3) {
                health += gain / 2;
                return "You got " + (gain / 2) + " health back.";
            } else if (level == 2) {
                health += gain / 4;
                return "You got " + (gain / 4) + " health back.";
            } else {
                health += gain / 8;
                return "You got " + (gain / 8) + " health back.";
            }
        } else {
            return "You were supposed to gain health back, but you seem to have full health.";
        }

    }


    public void getRemainingDragons(int dragonsLefted) {
        dragonLeft = 5 - dragonsLefted;
    }

    public int calculateHighScore() {
        int score = gold;
        if (dragonLeft != 0) {
            score = 50 * dragonLeft;
        }
        if (score > highscore) {
            highscore = score;
        }
        return highscore;
    }

    public void foundHealthPot() {
        if (healthPot) {
            System.out.println("You already found an health pot, and you can only have one a time.");
        } else {
            healthPot = true;
        }
    }



    public int attack() {
        int crit = (int) (Math.random() * 3) + 1;
        if (crit == 1) {
            return sword.getDamage() + 5;
        }
        return sword.getDamage();
    }
    public void dodge(Dragon dragon) {
        int dodge = (int) (Math.random() * 10) + 1;
        if (sword.getDodge() > dodge) {
            System.out.println("You dodge the attack from the dragon!!!");
        } else if (sword.getDodge() == dodge) {
            if (dragon.dragonAttack() % 2 != 0) {
                health -= (double) (dragon.dragonAttack() + 1) / 2 - 1;
                System.out.println("You barely dodge the attack and lost " + (dragon.dragonAttack() + 1) / 2 + " health. You have " + health + " remaining.");
            } else {
                health -= (double) dragon.dragonAttack() / 2;
                System.out.println("You barely dodge the attack and lost " + dragon.dragonAttack() / 2 + " health. You have " + health + " remaining.");
            }
        } else {
            health -= dragon.dragonAttack();
            System.out.println("You failed to dodge the attack and lost " + dragon.dragonAttack() + " health. You have " + health + " remaining.");
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
