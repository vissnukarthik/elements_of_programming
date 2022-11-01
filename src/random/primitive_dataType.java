package random;
import java.util.*;


public class primitive_dataType {
    public static void main(String[] args) {
        System.out.println(countBits(13));
        covertion(45,"987");
        parity_word(7);
    }
    public static  short countBits(int num){ // count number of 1's in the number
        short numBits = 0;
        while(num != 0){
            numBits+= num & 1; // & performs binary AND between two numbers
            num >>>= 1;        // >>> denotes unsigned right shift operator and always fill 0 irrespective of the sign of the number
        }
        return numBits;
    }
    public  static void covertion(int num,String strNum){
        int string_to_num=0;

        // String myString = "1234"; int foo = Integer.parseInt(myString);


        for(int i=0;i<strNum.length();i++){
            string_to_num= string_to_num*10 + strNum.charAt(i)-'0';
        }
        System.out.println(string_to_num);

    }

//    The parity of a binary word is 1 if the number of Is in the word is odd; otherwise,it is 0
    public static void parity_word(long x){
        int result =0; // 1 --> odd  0 --> even
        while ( x != 0){
            result ^= (x & 1);
            x >>>=1;
        }
        System.out.println(result);
    }


    public int reverseBits(int n) {
        int binaryNum = 0;

        for(int i=0;n>0;i++) {
            binaryNum = binaryNum<<1;
            binaryNum = binaryNum + (n&1);
            n=n>>1;
        }
        //System.out.println(binaryNum);
        return binaryNum ;
    }

}
