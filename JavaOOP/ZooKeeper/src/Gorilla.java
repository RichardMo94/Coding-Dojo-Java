
public class Gorilla extends Mammal {
	public void throwSoething() {
		energyLevel -= 5;
		System.out.println("The Gorilla threw something at you!");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla ate some bananas!");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("The Gorilla climbed a tree!");
		displayEnergy();
	} 
}
