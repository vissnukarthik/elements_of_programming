package recursion;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,88,555,-96};
       // System.out.println(findmin(arr,0));
       // Arrays.sort(arr);
       // System.out.println(recursiveBinarySearch(arr,88,0,arr.length-1));
        //System.out.println(fib(6));
       // System.out.println(productRecursive(4,2,0));

        //System.out.println(checkPrime(18,Math.sqrt(145)));
       // System.out.println(factorial(5));
        System.out.println(checkSorted(new int[]{4,5,68,7,8},3));
    }
    public static boolean checkSorted(int[] arr,int index){
        if(index==-1 || arr[index] > arr[index+1]) return false;
        if(index >=0) return checkSorted(arr,--index);
        return true;
    }
    public static int factorial(int num){
        if(num <= 1) return 1;
        return num*factorial(num-1);
    }
    public static boolean checkPrime(int num,double div){
        if(num%(int)div == 0) return true;
        if((int)div > 1)return checkPrime(num,--div);
        return false;
    }
    public static int productRecursive(int num,int multiplier,int product){
        if(multiplier != 0)
            return productRecursive(num,--multiplier,product+num);
        return product;
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n <= 2) return 1;
        return fib(n-1)+fib(n-2);
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
    public static int findmin(int[] arr,int i){

        if(arr.length == i)
            return arr[arr.length-1];
        return Math.min(arr[i],findmin(arr,++i));
    }

}
