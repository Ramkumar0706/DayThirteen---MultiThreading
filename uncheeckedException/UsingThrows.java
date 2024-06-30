package uncheeckedException;

import java.io.FileNotFoundException;

public class UsingThrows {
	
	public static void isPresent()throws Exception {
		
			 System.out.println(10/0);
		
	}
	
	public static void main(String[] args) {
		try {
			isPresent();
		} catch (Exception e) {
			System.out.println("the throw exception is handle by caller side");
			e.printStackTrace();
		}
	}

}
