package score;
import java.util.*;
public class factorial 
{
	public static void main(String[] args)
    {
        
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number Arman: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial= " + fact);
    }

}
