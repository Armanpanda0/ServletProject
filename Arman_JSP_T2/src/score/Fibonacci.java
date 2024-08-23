package score;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args)
    {
    
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number Arman: ");
        n = sc.nextInt();
        int a = 0,
        b = 1;
        
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a+" ");
           int  c = a + b;
            a = b;
            b = c;
        }
    }

}
