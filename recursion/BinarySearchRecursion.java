package recursion;
/*Finding an element in the given array using binary search with recursion*/
import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,15,23,35,50,53,57,61,65,67,68,73,86,95,99,111};
        System.out.print("Enter a element to search in the array : ");
        int target = sc.nextInt();
        System.out.println(searchElement(arr, target, 0, arr.length-1));

    }
    public static int searchElement(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (target < arr[m]) {
            return searchElement(arr, target, s, m-1);
        }
        return searchElement(arr,target,m+1,e);
    }
}
