package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,8,3,6,12,45};
        //System.out.println(binarySearch(arr,45));
        Arrays.sort(arr);
        System.out.println(recursiveBinarySearch(arr,5,0,arr.length));
    }
    public static int recursiveBinarySearch(int[] arr,int target,int start,int end){
        int mid =  start+(end-start)/2;
        if(start <=end) {
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) return recursiveBinarySearch(arr, target, mid + 1, end);
            else return recursiveBinarySearch(arr, target, start, mid - 1);
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while (end >= start){
            int mid = start+(end-start)/2;
            if(arr[mid] < target)
                start = mid+1;
            else if(arr[mid] > target)
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
