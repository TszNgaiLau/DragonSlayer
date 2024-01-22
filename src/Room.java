public class Room {
    private String[] room;

    private boolean searched;
    private boolean healthPotPresent;
    private int dragonLeft;
    public Room() {
        room = new String[]{"Entrance", "Hall", "Storage", "Dungeons", "Throne"};
        searched = false;
        dragonLeft = 5;
    }

    public void dragonKilled() {
        dragonLeft -= 1;
    }

    public void getSearched() {
        searched = true;
        int pot = (int) (Math.random() * 2) + 1;
        if (pot == 1) {
            System.out.println("You found an Health Pot!");
            healthPotPresent = true;
        }
        System.out.println("You did not find an Health Pot!");
        healthPotPresent = false;
    }
    public boolean isSearched() {
        return searched;
    }
}