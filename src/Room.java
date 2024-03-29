public class Room {
    private String[] room;

    private boolean searched;
    private boolean healthPotPresent;
    private int dragonLeft;
    private int idxRoom;
    public Room() {
        room = new String[]{"Hatchery", "Hall", "Storage", "Dungeons", "Throne"};
        searched = false;
        dragonLeft = 5;
        idxRoom = -1;
    }
    public void enterNewRoom() {
        searched = false;
    }

    public String getIdxRoom() {
        idxRoom += 1;
        return room[idxRoom];
    }

    public int getDragonLeft() {
        return dragonLeft;
    }

    public boolean getIsHealthPotPresent() {
        return healthPotPresent;
    }
    public boolean isSearched() {
        return searched;
    }
    public void dragonKilled() {
        dragonLeft -= 1;
    }
// Allows the program to know if the room was check and if they found anything in the current room.
    public void getSearched() {
        searched = true;
        int pot = (int) (Math.random() * 2) + 1;
        if (pot == 1) {
            System.out.println("You found an Health Pot!");
            healthPotPresent = true;
        } else {
            System.out.println("You did not find an Health Pot!");
            healthPotPresent = false;
        }
    }

}