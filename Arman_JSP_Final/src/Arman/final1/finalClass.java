package Arman.final1;
class Aq{
	void q1() {
		System.out.println("This is q1-A");
	}
	
}
class Bq extends Aq{
	@Override
	void q1() {
		System.out.println("This is q1-B");
	}
	
}

public class finalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aq a=new Aq();
		a.q1();
		Bq b1=new Bq();
		b1.q1();

	}

}
