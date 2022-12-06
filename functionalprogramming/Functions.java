package functionalprogramming;
import java.util.Scanner;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        System.out.println(greetFunction.apply("Welcome "));
    }
    static Function<String, String> greetFunction = message -> message + "Tilak";

}
