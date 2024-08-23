package Partten;

public class SnakeTriangle {
	
	public static void main(String ar []) {
		
		int count=1;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(count++ +"\t");
			}
			System.out.println();
		}
		
		
	}

}
