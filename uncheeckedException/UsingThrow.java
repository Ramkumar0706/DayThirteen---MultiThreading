package uncheeckedException;

import java.io.FileNotFoundException;

public class UsingThrow {
	
	
	
	public static void main(String[] args) {
		isThrowException();
	}

	private static void isThrowException() {
		try {
		throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println("using throw key word we invoke the exception and handled it");
		}
	}

}
