import java.util.ArrayList;
import java.util.Scanner;

public class AL {
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args){
		
		System.out.println("Enter an array of numbers and type 0 when finished: ");
		int in = reader.nextInt();
		
		while (in != 0){
			array.add(in);
			in = reader.nextInt();
		}
		
		System.out.println("---------------------------");
		
		for (int i : array){
			System.out.println(i);
		}
		
		System.out.println("What number would you like to delete?");
		int del = reader.nextInt();
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == del) {
				array.remove(i);
				break;
			}
		}

		PrintArray();
		
	}
	
	public static void PrintArray() {
		System.out.println("---------------------------");
		
		for (int i : array){
			System.out.println(i);
		}
	}	
}