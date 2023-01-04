package recursion.basics;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5};
        //System.out.println(sorted(arr,0));
        //System.out.println(linearSearch(arr,44,0));
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //System.out.println(ArrlinearSearch(arr,4,0,ans));
        ans = findALlIndex(arr,4,0);
        System.out.println(ans);
    }

    public static ArrayList<Integer> findALlIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(arr.length == index) return list;
        if(arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = findALlIndex(arr,target,index+1);
        //System.out.println(list);
        list.addAll(ansFromBelowCalls);

        return list;
    }
    public static ArrayList<Integer> ArrlinearSearch(int[] arr,int target,int index,ArrayList<Integer> ans){
        if(index == arr.length) return ans;
        if(arr[index]==target) ans.add(index);
        return ArrlinearSearch(arr,target,index+1,ans);
    }
    public static int linearSearch(int[] arr,int target,int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        return linearSearch(arr,target,index+1);
    }
    public static boolean sorted(int[] arr,int index){
        if(index == arr.length-1)
            return true;
        return arr[index] <= arr[index+1] && sorted(arr,index+1);
    }
}
