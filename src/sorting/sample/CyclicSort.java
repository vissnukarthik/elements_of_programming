package sorting.sample;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1,0,2};
        cylicSort(arr);
    }
    public static void cylicSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int j=0;
        while(j<arr.length){
            int correct = arr[j];
            if(arr[correct] != arr[j]){
                int temp = arr[j];
                arr[j] = arr[correct];
                arr[correct] = temp;
            }
            else
                j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
