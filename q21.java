import java.util.Scanner;
public class q21{
    public static void main(String[]args){
        double d,t,g;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        t=obj.nextInt();
        g=32.174;
        d=1.0/2*g*t*t;
        System.out.println("Distance travelled" +d);
    }
}