package recursion;

import java.util.Scanner;

public class CountSteps {
    public static int numberOfSteps(int num){
        return helper(num,0);
    }
    private static int helper(int num, int steps){
        //base condition
        /*If the number is equal to zero after the function calls
        * return number of steps */
        if (num==0){
            return steps;
        }
        /*If the number is even divide it by 2 and increment the stop*/
        if (num%2 == 0){
            return helper(num/2,steps+1);
        }
        /*If the number is odd subtract the number by 1 and increment the step*/
        return helper(num-1,steps+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
}
