/**
 * 1.Final is a Keyword and non_access Modifier.
 * 2.We can Use final keyword for method ,variable and class also.
 * 			like
 * 			Final Method.
 * 			Final Variable.
 * 			Final Class.
 * 
 * Q-1 Is Final method inherit the parent class to subclass ?
 * Ans:- Yes fianal method is inherit but it can't override to subclass from the superclass. 
 * 
 */

package Arman.final1;

class A{
	final void m1() {
		System.out.println("A-M1");
	}
}
class B extends A{
	void m2() {
		super.m1();
		System.out.println("B-M1");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.m2();

	}

}
