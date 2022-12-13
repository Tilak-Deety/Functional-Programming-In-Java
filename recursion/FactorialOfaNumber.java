package recursion;
/*Finding the factorial of a given number using recursion.
* This is not a good practice because the function calls takes more space in the memory.
* This is just for demo purpose to understand how recursion can be implemented
* in different ways*/
import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int n){
        //base condition
        if (n<=1){
            return n;
        }
        return n * factorial(n-1);
    }
}
