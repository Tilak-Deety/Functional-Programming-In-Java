package recursion;
/*This program is to find the sum of individual digits in a given number using recursion.
* Not a good practice*/
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of individual digits : ");
        int sum = sc.nextInt();
        System.out.println(sumIndividualDigits(sum));

    }
    public static int sumIndividualDigits(int n){
        //base condition
        if(n<=1){
            return n;
        }
        //Write the recurrence relation to find the sum of individual digits
        return (n%10) + sumIndividualDigits(n/10);
    }
}
