//Question 2.
package sample;
import java.util.Scanner;
class Area
{
    private int l,b;
    public void setDim(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public int getArea()
    {
        int area;
        area=this.b*this.l;
        return area;
    }
}
public class rectarea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the breadth of rectangle: ");
        int b=sc.nextInt();
        System.out.println("Enter the length of rectangle: ");
        int l=sc.nextInt();
        Area ar=new Area();
        ar.setDim(l,b);
        System.out.print("Area of rectangle :" + ar.getArea());
        System.out.println();
    }
}
