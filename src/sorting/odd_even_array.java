package sorting;

import java.util.Arrays;


public class odd_even_array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 9, 11, 12};
        //System.out.println(Arrays.toString(evenOdd(arr)));
        //evenOdd_book(arr);
        oddEvenbyts(arr);
        toFindSwap(new int[]{3, 5, 2, 7, 9, 11, 12});
    }

    static int[] evenOdd(int[] arr) {
        int nextEven = 0, nextOdd = arr.length - 1;

        while (nextOdd > nextEven) {

            if (arr[nextEven] % 2 != 0 && arr[nextOdd] % 2 == 0) {
                int temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd] = temp;

                nextEven++;
                nextOdd--;
            }
            if (arr[nextEven] % 2 == 0)
                nextEven++;
            if (arr[nextOdd] % 2 != 0)
                nextOdd--;
        }

        return arr;
    }

    public static void evenOdd_book(int[] A) {

        int nextEven = 0, nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
           // System.out.println(Arrays.toString(A));
            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }

        }
        System.out.println(Arrays.toString(A));
    }
    public static void oddEvenbyts(int[] arr){

        int start = 0,end = arr.length-1,count = 0;
        while (start < end){
            while(arr[start] %2 == 0){
                start++;
            }
            while (arr[end] %2 != 0){
                end--;
            }
            if(start<end){
                count++;
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]=temp;
            }
        }
        System.out.println("no swaps is  : "+count);
        System.out.println(Arrays.toString(arr));
    }
    static void toFindSwap(int[] arr){
        int odd = 0,even =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)even++;
        }
        for (int i=0;i<even;i++){
            if(arr[i] % 2 != 0)odd++;
        }
        System.out.println("count swap => :"+odd);
    }
}


// method 3 using bubble sort

