package search;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        String str = "karthik";
        System.out.println(SearchInString(str,'k'));
        System.out.println(Arrays.toString(str.toCharArray()));

        int[] arr = {4,5,222,8,23,9,3333,};
        System.out.println("the min val "+min(arr));

        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num: nums){
            if(even(num))
                count++;
        }
        return count;
    }

    static boolean even(int num){
        int count = 0;
//        count = (int)(Math.log10(num))+1; // for counting number of digits in an number
        while(num > 0){
            num/=10;
            count++;
        }

        return (count%2==0);
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]) min = arr[i];
        }
        return min;
    }
    static boolean SearchInString(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }

        return false;
    }

}
