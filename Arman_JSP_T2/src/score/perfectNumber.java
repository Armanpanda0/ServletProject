package score;
import java.util.*;
public class perfectNumber {
	public static void main(String[] args)
    {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Arman: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
        if (n== sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}
