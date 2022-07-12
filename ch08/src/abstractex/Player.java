package abstractex;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        level = playerLevel;
    }

    public void play(int count) {
        level.go(count);
    }
}
