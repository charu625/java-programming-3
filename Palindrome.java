//Question 5.
package sample;
import java.util.Scanner;
public class Palindrome {
    public static int palindrome(int num,int temp)
    {
        if(num==0)
            return temp;
        else
        {
            temp=(temp*10)+(num%10);
            return palindrome(num/10,temp);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num=sc.nextInt();
        int n=palindrome(num,0);
        if(n==num)
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}
