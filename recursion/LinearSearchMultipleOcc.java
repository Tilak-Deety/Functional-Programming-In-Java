package recursion;

import java.util.ArrayList;

public class LinearSearchMultipleOcc {
    public static void main(String[] args) {
        int[] arr = {12,54,63,82,87,94,94,98,99,111,365,284,295};
        System.out.println(multipleOccurence(arr, 94, 0, new ArrayList<>()));
    }
    static ArrayList<Integer> multipleOccurence(int[] arr, int target, int index, ArrayList<Integer> list){
        //base condition
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
            return multipleOccurence(arr, target, index+1, list);
    }
}
