Question 18 : Write a java program that reads the radius of a hemisphere and computes the surface area
and volume using the following formulas:
Surface Area of Hemisphere = 3 π r2
    Volume of a hemisphere = (2/3)πr3
Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
hemisphere. Hint: Use Math.PI.
Here is a sample run:
Enter the radius of the hemisphere: 7.0
The surface area of the hemisphere is 461.814
The volume area of the hemisphere is 718.377

import java.util.Scanner;
public class q18{
    public static void main(String[]args){
        double radius,surfacearea,volume;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere");
        radius=obj.nextDouble();
        surfacearea=Math.PI*3*radius*radius;
        volume=Math.PI*2/3*radius*radius*radius;
        System.out.println("The surface area of the hemisphere : " +surfacearea);
        System.out.println("The volume of the hemisphere : " +volume);
    }
}

OUTPUT :  
Enter the radius of the hemisphere
20
The surface area of the hemisphere : 3769.9111843077517
The volume of the hemisphere : 16755.160819145563
