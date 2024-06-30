package uncheeckedException;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		try {
			int a=10/0;
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");		
		}
		catch (Exception e) {
			System.out.println("Super Class Exception");
		}
	}

}
