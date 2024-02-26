Question 20 : The distance between two cities (in km.) is input through the keyboard. Write a java program
to convert and print this distance in meters, feet, inches and centimetres.

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
        System.out.println(km + " km is " +"  " + meter  +  " meter ");
        System.out.println(km + " km is " +"  " + feet  +  " feet ");
        System.out.println(km + " km is " +"  " + inches +  " inches ");
        System.out.println(km + " km is " +"  " + centimeter +  " centimeter ");
    }
}

OUTPUT :
Enter the distance in kilometer
20
20.0 km is   20000.0 meter 
20.0 km is   65616.798 feet
20.0 km is   787401.574 inches
20.0 km is   2000000.0 centimeter
