package uncheeckedException;

public class ArthamaticException {

	public static void main(String[] args) {
		

		try {
			int b=10/0;
		}
		catch (ArithmeticException e) {
			System.out.println(" ArithmeticException Handled \n");
		}
		System.out.println("After Handled");
		
		int a=10/0;
		System.out.println("After without Handled");
	}

}
