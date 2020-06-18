//Question 8.
package sample;
import java.util.Scanner;
public class pattern {
    public static void Print(int n,int k)
    {
        if(n<=0)
        {
            System.out.print(n+ " ");
        }
        else
        {
            System.out.print(n+" ");
            Print(n-k,k);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the difference:");
        int k=sc.nextInt();
        Print(n,k);
    }
}
