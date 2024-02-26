Question 17 : Enter the basic salary of an employee of an organization through the keyboard. His dearness
allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross salary.
Here is the sample run:
Enter basic salary: 15600
DA is 6240.0
HRA is 3120.0
Gross salary is 24960

import java.util.Scanner;
public class q17{
    public static void main(String[]args){
        double basic,DA,HRA,GROSS;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the basic salary");
        basic=obj.nextDouble();
        DA=basic*40/100;
        HRA=basic*20/100;
        GROSS=basic+DA+HRA;
        System.out.println("DA is: "+DA);
        System.out.println("HRA is: "+HRA);
        System.out.println("GROSS is "+GROSS);
    }
}

OUTPUT : 
Enter the basic salary
20000
DA is: 8000.0
HRA is: 4000.0
GROSS is 32000.0
