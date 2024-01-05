public class Dragon {
    private double health;
    private int level;

    public Dragon() {}

    public int dragonLevel() {
        int lev = (int) (Math.random() * 2) + 1;
        if (lev == 3) {
            level = 3;
        } else if (lev == 2) {
            level = 2;
        } else {
            level = 1;
        }
        return level;
    }

}
