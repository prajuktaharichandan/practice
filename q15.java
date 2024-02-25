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