package recursion;
/*In this program we are printing numbers using recursion.
* Here the function is calling itself until it satisfies the base condition.
* This program is not good because it is consuming lot a space in the memory.
* To print a number the entire function needs to be called in the stack recursively
* Until it satisfies the base condition.
* Instead we can use for loop to iterate through the elements to print them.
* This program is just for demo purpose.
* How the recursion is working*/
public class RecursionDemo1 {
    public static void main(String[] args) {
        printNumbers(1);
    }
    public static int printNumbers(int n){
        if (n==5){
            return n;
        }
        System.out.println(n);
        return printNumbers(n+1);
    }
}
