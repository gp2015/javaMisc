import java.util.Scanner;

public class TriangleArea {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		// 1/2 * base * height
		double base;
		double height;
		
		System.out.print("Enter the base: ");
		base = userInput.nextDouble();
		System.out.print("Enter the height: ");
		height = userInput.nextDouble();
		
		double area = (0.5 * base * height);
		
		System.out.println((int)area);
		
	}
	
}
