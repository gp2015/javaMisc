
public class CarAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* For each car, compute
		 * 	gas cost = (miles driven / mpg)
		 * 		x price per gallon
		 *  total cost = purchase price
		 *  	+ gas cost
		 *  
		 *  if total cost 1 < total cost 2
		 *  	buy car 1
		 *  else
		 *  	buy car 2
		 */
		
		System.out.println("Hello world");
		
		int car1Price = 15000;
		int car1MPG = 10;
		int car2Price = 30000;
		int car2MPG = 50;
		int gasGallon = 4;
		int miles = 50000;
		
		int gasCostCar1 = (miles/car1MPG) * gasGallon;
		int totalCostCar1 = car1Price + gasCostCar1;
		int gasCostCar2 = (miles/car2MPG) * gasGallon;
		int totalCostCar2 = car2Price + gasCostCar2;
		
		if (totalCostCar1 < totalCostCar2) {
			System.out.println("Buy car1");
		} else {
			System.out.println("Buy car2");
		}
		
		System.out.println(totalCostCar1);
		System.out.println(totalCostCar2);
		
	}

}
