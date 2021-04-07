
public class HumanTest {
	public static void main(String[] args) {
		
		Human testHuman1 = new Human("Richard");
		Human testHuman2 = new Human("Chris");
		Human testHuman3 = new Human("Jon");
		Wizard testWizard1 = new Wizard("Michael");
		Wizard testWizard2 = new Wizard("Jim");
		Wizard testWizard3 = new Wizard("Dwight");
		Ninja testNinja1 = new Ninja("Stanley");
		Ninja testNinja2 = new Ninja("Toby");
		Ninja testNinja3 = new Ninja("Richy");
		Samurai testSamurai1 = new Samurai("Jin-Yang");
		Samurai testSamurai2 = new Samurai("Erick");
		Samurai testSamurai3 = new Samurai("Gilfoyl");
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();
	}
}
