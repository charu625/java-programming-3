//Question 7.
package sample;
import java.util.Scanner;
public class inverted {

    public static void  invert(int n)
    {
        if(n==0)
        {
            System.out.print(n+ " ");
        }
        else
        {
            System.out.print(n+" ");
            invert(n-1);
            System.out.print(n+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the value: ");
        int i= sc.nextInt();
        invert(i);
    }
}
