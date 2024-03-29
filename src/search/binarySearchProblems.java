package search;
import java.util.*;

public class binarySearchProblems {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6,7,7,7};
        //System.out.println(Arrays.toString(ceilFloor(arr,7)));
        //System.out.println(search(arr,5,true)); // false for last occurance
        int[] nums = new int[]{5,6,0,1,5};
       // System.out.println(pivot(nums));
        System.out.println(pivotWithDuplicate(nums));

    }

    public static int pivot(int[] arr){
         int start = 0;
         int end = arr.length-1;
         while(start <= end){
             int mid  =  start+(end-start)/2;
             if(mid<end && arr[mid] > arr[mid+1])
                 return mid;
             else if(mid>start && arr[mid] < arr[mid-1])
                 return mid-1;

             if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                 // nd 2 add checking condition
                 if(arr[start] > arr[start+1]) return start;
                 start++;
                 if(arr[end] < arr[end-1]) return end;
                 end--;
             }
             else if(arr[start] >= arr[mid])
                 end=mid-1;
             else
                 start=mid+1;
         }
        return -1;
    }
    public static int pivotWithDuplicate(int[] arr){
        int start =  0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            else if (mid >start  && arr[mid] < arr[mid-1])
                return mid-1;

            if(arr[start] > arr[mid])
                end = mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    public static int search(int[] arr,int target ,boolean startIndex){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] > target)
                end = mid-1;
            else if(arr[mid] < target)
                start = mid+1;
            else{
                if(startIndex){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    ans = mid;
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static int[] ceilFloor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid  = start+(end-start)/2;
            if(arr[mid] > target)
                end=mid-1;
            else if(arr[mid] < target)
                start=mid+1;
            else
                return new int[]{arr[mid],arr[mid]};
        }
        return new int[]{arr[end],arr[start]};
    }
}
