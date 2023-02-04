package OOPs;

/*

final class parent{
    final public void fun(){
        System.out.println("parent function");
    }
}
class child extends parent{
    public void fun(){
        System.out.println("child function");
    }
}

*/
// chk final in condition statement
public class final_cls {
    public static void main(S   tring[] args) {
        /*
        final int n = 5;
        n+=1 // not possible
         */
        final StringBuffer str = new StringBuffer("vishnu ");
        str.append("karthik");
        System.out.println(str);
    }
}

