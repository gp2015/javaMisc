
public class ObjectIntro {
	
	int tWater = 0; // Liters of water in water bottle
	
	public ObjectIntro(){
		// Default Constructor
	}
	
	public ObjectIntro(int waterAmount){
		tWater = waterAmount;
	}
	
	public void addWater(int amount){
		tWater += amount;
	}
	public void drinkWater(int amount){
		tWater -= amount;
	}
	public int getWater(){
		return tWater;
	}
	
	
}
