//Question 3.
package sample;
import java.util.Scanner;
class Complexno
{
    private int r1,i1,r2,i2;
    public void input()
    {   Scanner s=new Scanner(System.in);
        System.out.println("Enter complex number 1");
        System.out.print("Real part:");
        r1=s.nextInt();
        System.out.print("Imaginary Part:");
        i1=s.nextInt();
        System.out.println("Enter complex number 2");
        System.out.print("Real part:");
        r2=s.nextInt();
        System.out.print("Imaginary Part:");
        i2=s.nextInt();

    }
    public void sum()
    {
        System.out.println("Sum of complex nos. is :"+(r1+r2)+"+"+(i1+i2)+"i");
    }
    public void product()
    {
        System.out.println("Product of complex nos. is :"+(r1*r2)+"*"+(i1*i2)+"i");
    }
    public void difference()
    {
        System.out.println("Difference of complex nos. is :"+(r1-r2)+"-"+(i1-i2)+"i");
    }
}
public class complex {
    public static void main(String[] args) {
        Complexno c1= new Complexno();
        c1.input();
        c1.sum();
        c1.product();
        c1.difference();
    }
}
