/**
 * Final method 
 * :-A Method Is prefixed with the Final Keyword call as the final Method.
 * :-We can't Override the final method
 * :-We can make final the  Overridden method.
 * 
 */

package Arman.final1;

class aA{
	void m1() {
		System.out.println("A=M1");
	}
	
}
class bB extends aA{
	 final void m1() {
		System.out.println("B=M2");
	}
}



public class finalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bB b=new bB();
		b.m1();

	}

}
