package recursion;
/*This program is to check whether the given array is sorted or not*/
public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {12,54,63,82,87,94,98,99,111,365,284,295};
        System.out.println(sortedOrNot(arr,0));
    }
    public static boolean sortedOrNot(int[] arr, int index){
        //base condition
        if (index == arr.length-1){
            return true;
        }/*
        This recurrence relation compares element of index i with
        the i+1 index if it is it satisfies the condition then it will also
        call another function call to check for the remaining elements in the
        given array. If all elements satisfies the condition (ie., if all the function
        calls satisfies the condition then it will return true otherwise if
        one of the function call does not satisfy the given condition
        it will return false.)
        */
        return arr[index] < arr[index+1] && sortedOrNot(arr,index+1);
    }
}
