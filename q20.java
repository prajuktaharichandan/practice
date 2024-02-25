import java.util.Scanner;
public class q20{
    public static void main(String[]args){
        double km , meter , feet , inches , centimeter;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the distance in kilometer");
        km=obj.nextInt();
        meter=km*1000;
        feet=km*3280.8399;
        inches=km*39370.0787;
        centimeter=km*100000;
        System.out.println(km + "km is" +"  " +meter + "meter");
        System.out.println(km + "km is" +"  " +feet +"feet");
        System.out.println(km + "km is" +"  " +inches +"inch");
        System.out.println(km + "km is" +"  " +centimeter +"centimeter");
    }
}