package recursion.sub;

public class skiper {
    public static void main(String[] args) {
 //       System.out.println(removeChar("haka"));
//        skip("","aadaij");
        System.out.println(skipApple("appleplantappleiphone"));
    }


    public static String skipApple(String up){
        if (up.isEmpty()) return "";
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else return up.charAt(0)+skipApple(up.substring(1));
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        else{
            char ch = up.charAt(0);
            if(ch == 'a') skip(p,up.substring(1));
            else skip(p+up.charAt(0),up.substring(1));

        }
    }
    public static String removeChar(String up){
        if(up.isEmpty()) return "";
        char ch = up.charAt(0);
        if(ch == 'a') return removeChar(up.substring(1));
        else return ch+removeChar(up.substring(1));
    }
}
