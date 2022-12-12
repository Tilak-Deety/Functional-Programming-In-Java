package recursion;
/*This program is to print the fibonacci number using recursion.
* Here we are using the recurrence relation to calculate the fibonacci number.*/

public class RecursionDemo2 {
    public static void main(String[] args) {
        int answer = fibonacciNumber(13);
        System.out.println(answer);
    }
    public static int fibonacciNumber(int n){
        //base condition
        if (n<2){
            return n;
        }
        //recurrence relation
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

}
