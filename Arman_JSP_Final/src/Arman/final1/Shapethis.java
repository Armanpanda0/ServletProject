/*
 * Super Keyword is use to access the immidiate parent class property like the datamember and member function. .
 *  :- call to super OR super() is use to call the immidiate parent class constructure 
 */

package Arman.final1;
class shape{
	String color;
	public shape(String color) {
		this.color=color;
	}
	
	public void display() {
		System.out.println(this.color);
	}
}
class Rectangle extends shape{
	int len;
	int bre;
	public Rectangle(String color,int len,int bre) {
//		this.color=color;
		super(color);
		this.len=len;
		this.bre=bre;
	}
	public void display() {
		super.display();
		System.out.println(this.len);
		System.out.println(this.bre);
	}
}

class Circle extends shape {
	int rad;
	public Circle(String color,int rad) {
		super(color);
		this.rad=rad;
	}
	public void display() {
		super.display();
		System.out.println(rad);
	}
}


public class Shapethis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle("Red",1,2);
		r.display();
		Circle c1=new Circle("Blue",22);
		c1.display();

	}

}
