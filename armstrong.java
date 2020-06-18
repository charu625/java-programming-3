//Quetion 1.
package sample;
import java.util.Scanner;
public class armstrong {
 // To Count no. of digits in a number given by user
    public static int cnt(int num)
    {
        int a,count=0;
        a=num;
        while(a>0)
        {
            count++;
            a=a/10;
        }
        return count;
    }
    // To calculate whether the given no. is Armstrong or not
    public static void  arm(int num,int n)
    {
        int sum=0,x,a;
        a=num;
        while (a>0)
        {
            x=a%10;
            sum+= (int)Math.pow(x,n);
            a=a/10;
        }
        if(sum==num)
        {
            System.out.println(" It is Armstrong Number");
        }
        else
        {
            System.out.println("It is not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        arm(num,cnt(num));
    }
}
