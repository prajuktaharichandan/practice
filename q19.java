Question 19 : Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 749, the sum of all its digits is 20.
Hint: Use the % operator to extract digits, and use the /
operator to remove the extracted digit.
For instance, 749 % 10 = 9 and 749 / 10 = 74. 

import java.util.Scanner;
public class q19{
    public static void main(String[]args){
        int n,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number between 0 to 1000");
        n=obj.nextInt();
        int r = n%10;
        sum = sum + r;
        n = n/10;
        sum = sum + r;
        n = n/10;
        r = n%10;
        sum = sum+r;
        System.out.println("the sum of the digit is" +sum);
    }
} 

OUTPUT : 
Enter a number between 0 to 1000
999
the sum of the digit is: 27
    
