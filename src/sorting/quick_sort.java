package sorting;

import java.util.Arrays;


public class quick_sort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int []arr,int start,int end){
        int s= start;
        int e =end;
        int pivot = arr[end];

        while(s<e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            } 
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;

                s++;e--;
            }
            if(e>start){
                quickSort(arr,start,e);
            }
            if(s<end){
                quickSort(arr,s,end);
            }
        }

    }

}
