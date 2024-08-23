package score;
import java.util.*;
public class reverseNumber {

	public static void main(String[] args)
    {
        int n, num, r;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Arman: ");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        System.out.println("Reverce of Number: " + rev);
    }
}
