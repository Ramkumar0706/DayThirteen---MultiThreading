package exceptionMethodOverriding;

import java.io.FileNotFoundException;

class Parent1{
	void msg() throws Exception{
		System.out.println("Parent class");
	}
}

class Child1 extends Parent1{
	@Override
	void msg() throws  FileNotFoundException{
		System.out.println("child Class");
		int a=10/0;
		
	}

}

public class CkeckedException {
	
	public static void main(String[] args) {
		Parent p=new Child();
		try {
		p.msg();
		}
		catch (Exception e) {
			System.out.println("the sub class method using throws");
		}
	}
		
	}