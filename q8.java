Question 8 : Write a java program to exchange the values of two variables of integer type X and Y without
using third temporary variable.

public class q8{
    public static void main(String[]args){
        int x=50;
        int y=30;
        System.out.println("Before Swapping\n" +" x="+ x +"\n y=" + y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping\n" +" x="+ x +"\n y=" + y);
    } 
}

OUTPUT : 
Before Swapping
 x=50
 y=30
After Swapping
 x=30
 y=50
