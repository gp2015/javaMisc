
public class ObjectIntroTest {
	public static void main(String[] args){
		
		ObjectIntro waterBottle = new ObjectIntro(0); // new water bottle with 0 water in it
		waterBottle.addWater(100); // add 100 liters of water
		waterBottle.drinkWater(20);
		System.out.println("Remaining water: " + waterBottle.getWater());
	}
}
