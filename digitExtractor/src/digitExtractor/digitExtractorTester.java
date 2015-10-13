package digitExtractor;
import java.util.Scanner;

public class digitExtractorTester {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("Enter 5 digits: ");
		String in = input.nextLine();
		System.out.println("Math:");
		digitExtractor demath = new digitExtractor(Integer.parseInt(in));
		demath.returnInveretedOrderByMath();
		System.out.println("Strings:");
		digitExtractor deconceptual = new digitExtractor(in);
		deconceptual.returnInvertedOrderByString();
	}
	
}
