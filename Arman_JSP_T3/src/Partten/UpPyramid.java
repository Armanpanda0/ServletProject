package Partten;

public class UpPyramid {
	public static void main(String args[]) {
		
		int n=5;
		int st=1;
		int sp=n-1;
		 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			sp--;
			st+=2;
			System.out.println();
		}
	}

}
