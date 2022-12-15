package recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,54,63,82,87,94,98,99,111,365,284,295};
        System.out.println(search(arr, 87, 0,arr.length-1));
    }
    static int search(int[] arr, int target , int s, int e){
        //base condition
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (arr[s] <= arr[m]){ //so we know that element is sorted
            if (target>=arr[s] && target <= arr[m]){
                return search(arr, target, s, m-1);
            }else {
                return search(arr, target, m+1, e);
            }
        }
        if (target>=arr[m] && target<=arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
