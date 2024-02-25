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