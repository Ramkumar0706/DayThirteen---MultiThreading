package uncheeckedException;

public class NestedTryAndCatchBlock {

	public static void main(String[] args) {
		try
		{
			try {
				try {
int[]a=new int[10];
System.out.println(a[11]);

				}
				catch (ArithmeticException e) {
					System.out.println("second Catch block");
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("first innner catch block");
			}
		}
		catch (Exception e) {
			System.out.println("outer catch block");
		}
	}

}
