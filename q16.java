Question 16 : Write a java program that reads a Fahrenheit degree in a double value from the console, then
converts it to Celsius and displays the result. The formula for the conversion is as follows:
Celsius = (Fahrenheit-32) *(5/9)
//Hint: Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
Here is a sample run:
Enter a degree in Fahrenheit: 54
54 Fahrenheit is 12.22 Celsius

import java.util.Scanner;
public class q16{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the degree in Farenhite:");
        double f = obj.nextDouble();
        double c =(f-32)*5/9;
        System.out.println( f + " Farenhite is " + c + " Celcius ");
    }
}

OUTPUT : 
Enter the degree in Farenhite:
44
44.0 Farenhite is 6.666666666666667 Celcius 
