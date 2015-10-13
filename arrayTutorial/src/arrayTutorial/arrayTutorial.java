package arrayTutorial;

import java.util.Arrays;

public class arrayTutorial {
	
	public static void main(String[] args){
		
		int arrInt[] = new int[5];
		
		int i = 0;
		
		while (i <= 4){
			arrInt[i] = i + 1;
			i++;
		}
	
		int e = arrInt.length - 1;
		
		while (e >= 0){
			System.out.println(arrInt[e]);
			e--;
		}
		
	}
	
}
