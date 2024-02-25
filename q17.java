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