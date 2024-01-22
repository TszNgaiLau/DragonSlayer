import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class DragonSlayer {
    Scanner scan = new Scanner(System.in);
    public Dragon dragon;
    public Player p1;
    public Room currentRoom;
    int dragonslayed = 0;
    public void play() {
        welcomePlayer();
        menu();
    }
    public void welcomePlayer() {
        System.out.println("Welcome to DRAGON SLAYER!!!");
        System.out.println("Your goal in this game is to kill five dragons!!");
        System.out.println("Isn't this exciting!!!");
    }

    public void menu() {
        p1 = new Player();
        dragon = new Dragon();

        while(dragonslayed != 5 || !p1.isDead()) {
            if (dragon.isDead()) {
                dragon = new Dragon();
                dragonslayed += 1;
                currentRoom.dragonKilled();
            }
            System.out.println("What would you like to do?");
            System.out.println("(A) Searched for a health Pot");
            System.out.println("(B) Enter next room");
            System.out.println("(C) Use Health Pot");
            System.out.println("(D) Attack dragon");
            System.out.println("(E) Inspect dragon level");
            System.out.println("(F) View current health");
            System.out.println("(G) View current weapon stats");
            System.out.println("(H) View current high score");
            String choice = scan.nextLine().toLowerCase();
            processChoices(choice);
        }

    }

    public void processChoices(String choice) {
        if (choice.equals("a")) {
            currentRoom.getSearched();
            p1.foundHealthPot();
        } else if (choice.equals("b")) {
            System.out.println("You think you can just leave after entering my domain!?");
            System.out.println("If you wish to leave you gotta kill me first!!!");
        } else if (choice.equals("c")) {
            System.out.println(p1.useHealthPot());
        } else if (choice.equals("d")) {
            dragon.dragonHealth(p1.attack());
        } else if (choice.equals("e")) {
            System.out.println(dragon.getLevel());
        } else if (choice.equals("f")) {
            System.out.println(p1.getHealth());
        } else if (choice.equals("G")) {
            System.out.println(p1.getSword());
        } else {
            System.out.println(p1.getHighScore());
        }
    }
}
