import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FW {
	public static void main(String[] args){
		File newFile = new File("C:/Users/Dozer/Desktop/newFile.txt");
		if (newFile.exists()) {
			System.out.println("The file already exists");
		} else {
			try {
				newFile.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter fileW = new FileWriter(newFile);
				BufferedWriter buffW = new BufferedWriter(fileW);
				buffW.write("This is the tutorial, it is 1:06 AM EST");
				buffW.close();
				System.out.println("File written!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
