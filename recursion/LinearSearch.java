package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,54,63,82,87,94,98,99,111,365,284,295};
        System.out.println(search(arr,0,5));
        System.out.println(searchIndex(arr, 0, 87));
        System.out.println(searchFromLast(arr, arr.length-1, 54));
    }
    /*to check whether the target is present in the given array or not
    * It will return a boolean value*/
    static boolean search(int[] arr, int index , int target){
        //base condition
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, index+1 , target);
    }
    /*This will return the index if the target is present in the given array*/
    static int searchIndex(int[] arr, int index , int target){
        //base condition
        if (index == arr.length){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }else
            return searchIndex(arr, index+1, target);
    }
    /*to check the target element in the array in reverse order.
    Searching from the last index in the given array*/
    static int searchFromLast(int[] arr, int index ,int target){
        //base condition
        if (index < 0 ){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else{
           /*Here we are decrementing the index value because we are
           * searching the target from the last element in the given array*/
            return searchIndex(arr, index-1,target);
        }
    }

}
