package recursion;

/*This program is to find the reverseFun of a given number using recursion*/
public class ReverseOfNumber {
    static int sum =0;
    static void reverseFun(int n){
        //base condition
        if (n==0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseFun(n/10);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to reverseFun : ");
//        int number = sc.nextInt();
        reverseFun(123266);
        System.out.println(sum);
    }

}
