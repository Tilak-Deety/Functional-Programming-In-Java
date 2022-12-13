package recursion;
/*The program is to find the product of individual digits using recursion.
* This is just for demo purpose
* Not a good practise*/

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the product of digits : ");
        int product = sc.nextInt();
        System.out.println(productIndividualDigits(product));
    }

    public static int productIndividualDigits(int n){
        //base condition
        if (n%10==n){
            return n;
        }
        //recurrence relation
        return (n%10) * productIndividualDigits(n/10);
    }
}
