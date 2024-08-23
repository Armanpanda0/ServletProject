package score;
import java.util.*;
public class abc {

	 public static void main (String[]args)
	   {
		 Scanner sc=new Scanner(System.in);
		 	System.out.print("Enetr 1st num");
	     int l = sc.nextInt();
	     System.out.print("Enetr 1st num");
	     int u = sc.nextInt();


	     for (int i = l; i <= u; i++)
	       if (isPrime (i))
	    	   
	        System.out.println (i);
	   }

	   static boolean isPrime (int n)
	   {
	     int count = 0; 
	     if (n < 2)
	       return false;
	     	     for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }
	     return true;
	   }

}
