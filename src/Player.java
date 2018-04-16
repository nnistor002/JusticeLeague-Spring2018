import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

	public double hp = 30;
	public double damage = 65.0;
	public boolean isDead = false;

	private Map<String, ArrayList<String>> playerMap = new HashMap<String, ArrayList<String>>();
	public List<String[]> playerInRoom = new ArrayList<String[]>();

	public Player() {
		fetchPlayer();
	}

	public void setHealth(double health) {
		hp = health;
	}

	public void getHealth(double itemValue) {

		this.hp = hp + itemValue;

	}

	public double dealDamage(double damage) {
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
		hp = health + health;

	}

	public boolean isDead() {
		return false;

		// if(progressBarHealth.getValue()<=0) {
		//
		// // game over
		//
	}

	public void fetchPlayer() {
		// inventory
		// progressBarValue()
		// damage

	}
}
