package patterns;
//full pyramid star pattern
public class PatternExample11 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
