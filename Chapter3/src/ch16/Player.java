package ch16;

public class Player {


	int level = 0;
	
	
	public static void main(String[] args) {
		PlayerLevel player;
		player = new BeginnerLevel();
		player.go(0);
		player = new AdvancedLevel();
		player.go(0);
		player = new SuperLevel();
		player.go(0);
		
	}
	
	public int getLevel() {
		return level; 
	}

	public void upgradeLevel(PlayerLevel player) {
		
	}
	public void play() {
		
	}
	
}
