package sorting.sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,5,0,8,7,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int start = 0,end = arr.length-i-1;
            int max = getmaxIndex(arr,start,end);

            int temp = arr[end];
            arr[end] = arr[max];
            arr[max] = temp;
        }

    }
    static int getmaxIndex(int[] arr, int start, int end){
        int max= start;
        for(int i=start;i<=end;i++){
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        return max;
    }
}
