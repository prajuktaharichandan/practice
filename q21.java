Question 21 : When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
distance it travels is given by d = (1/2) gt2
Here d is in feet, t is the time in seconds, and g is 32.174.
Write a program that asks the user for the number of seconds and then prints out the distance
travelled.

import java.util.Scanner;
public class q21{
    public static void main(String[]args){
        double d,t,g;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of seconds : ");
        t=obj.nextDouble();
        g=32.174;
        d=1.0/2*g*t*t;
        System.out.println("Distance travelled :" +d);
    }
}

OUTPUT
Enter the number of seconds :    5.4
Distance travelled : 469.09692
