
public class Human {
	public String name = "";
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public Human() {
		
	}
	public Human(String name) {
		this.name = name;
	}
//	Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
		System.out.println(this.getName() + " attacked " + human.getName() + " for " + this.getStrength() + " damage! ");
	}
	
}