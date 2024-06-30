package uncheeckedException;

public class MultipleCatchBlock2 {
	
	public static void main(String[] args) {
		try {
			int[] a=new int[2];
			System.out.println(a[22]);
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
