import java.util.Scanner;
public class q16{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the degree in Farenhite:");
        double f = obj.nextDouble();
        double c =(f-32)*5/9;
        System.out.println( f + "Farenhite is" + c + "Celcius");
    }
}