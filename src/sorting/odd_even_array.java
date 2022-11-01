/*package sorting;

import java.util.Arrays;


public class odd_even_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //System.out.println(Arrays.toString(evenOdd(arr)));
        evenOdd _book(arr);
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
}

// method 3 using bubble sort
*/
