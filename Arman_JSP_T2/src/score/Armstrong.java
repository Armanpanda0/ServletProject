package score;
import java.util.*;


public class Armstrong {
	  public static void main(String[] args)
	    {
	        int n;
	        int count = 0;
	        int  num, r;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number Arman: ");
	        n = sc.nextInt();
	        num = n;
	        while (num > 0)
	        {
	            r = num % 10;
	            count = count + (r * r * r);
	            num = num / 10;
	        }
	        if (n == count)
	        {
	            System.out.println("Armstrong Number");
	        }
	        else
	        {
	            System.out.println("Not Armstrong Number");
	        }
	    }

}
