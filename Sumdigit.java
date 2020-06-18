//Question 6.
package sample;
import java.util.Scanner;
public class Sumdigit
{
    public static int sum(int num)
    {
         if(num==0)
            return 0;
        else
        {
          return num%10+sum(num/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter a number: ");
        int num= sc.nextInt();
        System.out.println("Sum of all digits is: "+ sum(num));
    }
}
