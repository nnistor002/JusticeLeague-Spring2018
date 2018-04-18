import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Player {

	private Random rn = new Random();
	
	public double hp = 150;
	public double damage ;
	public int weaponMin = 0;
	public int weaponMax = 5;
	public boolean isDead = false;

	private Map<String, ArrayList<String>> playerMap = new HashMap<String, ArrayList<String>>();
	public List<String[]> playerInRoom = new ArrayList<String[]>();

	public Player() {
		//fetchPlayer();
	}

//	public void setHealth(double health) {
//		hp = health;
//	}

//	public void getHealth(double itemValue) {
//
//		this.hp = hp + itemValue;
//
//	}

	public void setDamage(int max, int min) {
		weaponMin = min;
		weaponMax = max;
	}
	
	public double attackDamage( ) {
		damage = rn.nextInt((weaponMax - weaponMin)+weaponMin);
		return damage;
	}

	public void takeDamage(double damage) {

		if (hp - damage <= 0) {
			hp = 0;
			isDead = true;
		} else {
			hp -= damage;
		}

	}

	public void gainHealth(double health) {
		hp = hp + health;

	}

	public boolean isDead() {
		return false;

		// if(progressBarHealth.getValue()<=0) {
		//
		// // game over
		//
	}


//	public void fetchPlayer() {
//		 inventory
//		 progressBarValue()
//		 damage
//
//	}
}
