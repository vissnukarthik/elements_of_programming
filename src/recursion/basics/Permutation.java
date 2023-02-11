package recursion.basics;

public class Permutation {
    public static void main(String[] args) {
        permautation("","123");
    }
    static void permautation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permautation(f+ch+s,up.substring(1));
        }
    }
}
