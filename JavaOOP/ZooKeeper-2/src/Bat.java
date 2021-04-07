
public class Bat {
	
	public int energyLevel = 300;
	
	public int displayEnergy() {
		System.out.println("Energy level: " + energyLevel);
		return energyLevel;
	}
	public void fly() {
		energyLevel -= 50;
		System.out.println("The bat flew");
		
	}
	public void eatHumans() {
		energyLevel -= 25;
		System.out.println("The bat ate a human!");
		
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("The bat attack a whole town!!");
		
	}
}
