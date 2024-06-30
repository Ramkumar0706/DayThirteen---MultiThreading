package uncheeckedException;

public class ArrayIndexOutOfBound {
	
	public static void main(String[] args) {
		int[] a=new int[2];
		
		try {
			System.out.println(a[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}
		System.out.println("successfully executed ");
		
		System.out.println(a[4]);
	}

}
