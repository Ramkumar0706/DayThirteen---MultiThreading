package customCheckedException;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		if(name.equalsIgnoreCase("Tom")) {
			System.out.println("hello "+name);
		}
		else {
			try {
				throw new UserNotFoundException("Sorry user is not found");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
