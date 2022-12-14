package recursion;

import java.util.Scanner;

public class CountZeros {
    public static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n , int c ){
        //base condition
        /*After all the function calls if it equals base condition this
        * helper function simply returns the c value to the count function*/
        if (n==0){
            return c;
        }
        //checking the number if it is equal to zero or not
        int rem = n%10;
        //If the remainder is equal to zero then divide it by 10 and increment c
        if (rem == 0){
            /*If the number is equal to zero then the number is divided by 10
            * and c is incremented and pass to the helper function for the
            * next function call*/
            return helper(n/10, c+1);
        }
        /*if the remainder is not equal to zero simply divide
        the number by 10 and pass for the next function call*/
        return helper(n/10,c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count the number of zeros in it : ");
        int number = sc.nextInt();
        System.out.println(count(number));
    }
}
