package sorting.sample;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = new int[]{5,8,9,4,2,3,1,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped =false; // will be false till the first swap occurs
            // j=1 becz if arr.length less than or equal to 1 then array will become out of bound index (arr[-1] not possible)
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    //arr[j] = arr[j]^arr[j+1]^(arr[j+1]=arr[j]);
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){ // if array is sorted no swap will occur and swapped will be false
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
