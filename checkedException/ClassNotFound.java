package checkedException;

public class ClassNotFound {
	
	public static void main(String[] args) {
		try {
			Class.forName("com");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException handle ");
			//e.printStackTrace();
		}
	}

}
