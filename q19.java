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