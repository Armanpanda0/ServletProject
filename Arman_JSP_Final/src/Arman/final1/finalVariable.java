/*
 * To Accessing the Non Static Variable in main method we should create the instance Creation[new finalVariable().pi] (Object referance) or Class Referance [finalVariable fb=new finalVariable();] . 
 */

package Arman.final1;

public class finalVariable {
	 final static int a=10;
	 final double pi=3.141; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		finalVariable fb=new finalVariable();
		System.out.println(fb.pi);
		System.out.println(new finalVariable().pi);
			
	}

}
