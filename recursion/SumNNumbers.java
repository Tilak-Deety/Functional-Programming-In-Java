package recursion;

import java.util.Scanner;

/*This program is to find the sum of n numbers using recursion */
public class SumNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of all its decreasing order of digits : ");
        int sum = sc.nextInt();
        System.out.println(nNumber(sum));
    }

    public static int nNumber(int n){
        //base condition
        if (n<=1){
            return n;
        }
        //recurrence relation
        return n + nNumber(n-1);
    }
}
