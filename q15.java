Question 15 : Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without using extra variables

public class q15{
    public static void main(String[]args){
        int W=1,G=2,K=3,A=4;
        System.out.println("Value before swapping");
        System.out.println("W = " + W);
        System.err.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);
        int temp = G;
        G = K;
        K = temp;
        System.out.println("Values after swapping are : ");
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        
    }
}

OUTPUT : 
Value before swapping
W = 1
G = 2
K = 3
A = 4
Values after swapping are :
G = 3
K = 2
