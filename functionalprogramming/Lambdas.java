package functionalprogramming;

import java.util.Scanner;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.println(greetFunction.apply(name));

    }
    static Function<String, String> greetFunction = name -> "Hello " + name;
}
