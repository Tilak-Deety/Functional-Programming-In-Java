package patterns;

public class DownwardHIll {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=row; space++){
                System.out.print("  ");
            }
            for(int col=row; col<n; col++){
                System.out.print("* ");
            }
            for(int col=row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
