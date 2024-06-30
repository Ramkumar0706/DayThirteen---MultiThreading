package customCheckedException;

import java.util.Scanner;

public class PersonAge {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Person age");
		int age=sc.nextInt();
		if(age>17)
			System.out.println("The Person age is valided");
	
	else {
		throw new AgeInvalidException("your age is under below");
	}
	}

}
