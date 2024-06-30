package uncheeckedException;

public class UsingFinallyBlock {
	
	public static void main(String[] args) {
		int[] a=new int[2];
	try {
		System.out.println(a[9]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("arrayIndexOutOfBond");
		System.out.println(10/0);
	}
	finally {
		System.out.println("the finally block executed Succesfully");
	}
	}

}
