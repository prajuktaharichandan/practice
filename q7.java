Question 7: Write a java program to exchange the values of two variables of integer type X and Y using
third temporary variable Z

public class q7{
    public static void main(String[]args){
        int x=20;
        int y=40;
        System.out.println("Before swapping\n" +"x="+x +"\ny="+y);
        int z=x;
        x=y;
        y=z;
        System.out.println("After swapping\n" +"x="+x +"\ny="+y);       
    }
}

OUTPUT : 
Before swapping
x=20
y=40
After swapping
x=40
y=20
