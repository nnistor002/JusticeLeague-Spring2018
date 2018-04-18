import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Monster {

	private FileReader fR;
	private  Scanner sR;

	private Random rn = new Random();

	private Map<String, String[]> monsterMap = new HashMap<String, String[]>(); 
	public Map<String,Boolean> monsterDead = new HashMap<String,Boolean>();

	public String currentRoom;
	public String mName;
	public String mDetails;
	public int mMaxHp;
	public double mHealth;
	public int mDamageMin;
	public int mDamageMax;

	public boolean inbattle;

	public Monster() {
		fetchMonsterData();
	}

	public void fetchMonsterData() {

		try{		
			fR = new FileReader("Monster.txt");
			sR = new Scanner(fR);

			while(sR.hasNextLine()) {
				String line = sR.nextLine();
				String[] splitLine = line.split("--");
				String e = splitLine[0];

				monsterMap.put(e, splitLine);
				monsterDead.put(e, false);
			}
			fR.close();
			sR.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}	

	public String getMonsterDetails() {
		return mDetails;
	}

	public void attackMonster() {

	}

	public int getMonsterDamage() {
		int d = rn.nextInt((mDamageMax - mDamageMin) + 1) + mDamageMin;
		return d;
	}

	public String doDamage(double d) {
		if((mHealth-d) <= 0.0) {
			monsterDead.replace(currentRoom, true);
			return "The monster is dead.";
		}
		mHealth -= d;
		return "The monster took damage now its health is "+ mHealth; 
	}


	public void getMonsterInRoom(String room) {
		if(monsterMap.containsKey(room)) {
			String[] m = monsterMap.get(room);
			System.out.println(Arrays.toString(m));
			currentRoom = m[0];
			mName = m[2];
			mDetails = m[3];
			mHealth = Double.parseDouble(m[8]);
			mMaxHp =Integer.parseInt(m[8]);
			mDamageMin = Integer.parseInt(m[6]);
			mDamageMax = Integer.parseInt(m[7]);
		}
	}
	public boolean isThereAMonster(String s) {
		if(monsterMap.containsKey(s)) {
			if(monsterDead.get(s).equals(true)) {
				return false;
			}else{
				return true;
			}

		}else{
			return false;
		}

	}

	public void playerInBattle() {
		inbattle = true;
		System.out.println(inbattle);
	}

	public void playerOutBattle() {
		inbattle = false;
		System.out.println(inbattle);
	}
	
	public String specialAttack(int n) {
		int d;
			d = (mMaxHp/2);
			String str =doDamage(d);
		return str;
	}










}