package exceptionMethodOverriding;


class Parent{
	void msg() {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	@Override
	void msg() throws ArithmeticException{
		System.out.println("child Class");
		int a=10/0;
		
	}

}

public class UnckeckedException {
	
	public static void main(String[] args) {
		Parent p=new Child();
		try {
		p.msg();
		}
		catch (ArithmeticException e) {
			System.out.println("the sub class method using throws");
		}
		
	}



}
