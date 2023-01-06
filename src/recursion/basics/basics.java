package recursion.basics;

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
       // System.out.println(checkSorted(new int[]{4,5,68,7,8},3));
        print(1);
       // System.out.println(sumDigit(1324));
        //reverseNum(284);
        //System.out.println(sumNum);
        //System.out.println(revNum(284));
    }

    static int revNum(int n){
        if (n==0) return 0;
        int  siz= Integer.toString(n).length();
        double mul = Math.pow((double) 10,siz-1);
        return (n%10)*(int) mul + revNum(n/10);
    }
    public static int sumNum = 0;
    static void reverseNum(int n){
        if(n==0) return ;
        sumNum=sumNum*10+(n%10);
        reverseNum(n/10);
    }
    static int sumDigit(int n){
        if(n==0) return 0;
        return n%10 + sumDigit(n/10);
    }
    static void print(int n){
        if (n==5) return;
        print(n+1);
        System.out.println(n);
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
