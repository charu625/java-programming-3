//Question 4.
package sample;
import java.util.Scanner;
class circle
{
    private double radius;
    private String color;
    circle()
    {
        radius=1.0;
        color="red";
    }
    circle(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }

}
public class circleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        circle c1= new circle();
        System.out.print("Enter the radius of the circle:");
        int radius= sc.nextInt();
        circle c2= new circle(radius);
        System.out.print("Radius of default circle is:"+c1.getRadius());
        System.out.println();
        System.out.print("Area of default circle is:"+c1.getArea());
        System.out.println();
        System.out.print("Radius of circle entered by user:"+c2.getRadius());
        System.out.println();
        System.out.print("Area of circle entered by user:"+c2.getArea());

    }
}
