
public class TryCatch {
	
	public static void main(String[] args){
		int x = 0;
		int y = 2;
		
		try{
			int answer = y / x;
			System.out.println(answer);			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("End program");
		}

	}
	
}
