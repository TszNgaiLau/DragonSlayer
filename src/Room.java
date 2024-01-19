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

    public boolean getSearched() {
        return searched;
    }
    public boolean setSearched() {


    }
}