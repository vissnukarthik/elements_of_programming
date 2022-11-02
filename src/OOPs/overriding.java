package OOPs;

class parent{
    static int snum = 1;
    int num = 10;
    public void m1(){

        System.out.println("parent - m1");
    }
}
class child extends parent{
    static int snum = 2;
    int num = 20;

    public void m1(){
        System.out.println("child - m1");
    }
}
/*
public to protected or public only possible
class accesModParent{
    private void fun(){
        System.out.println("acces Mod  - parent");
    }
}
class accesModChild extends {
    public void fun(){
        System.out.println("access Mod - child");
    }
}
*/

// child class also can be parent ..
abstract class absParent{
     abstract public void absfun();
}
class  absChild extends absParent{
    public void absfun(){
        System.out.println("abs function ");
    }
}

// return type should not be going down
class retParent{
    public Object retfun(){
        Object b= new Object();
        System.out.println("object ret -parent function");
        return b;
    }
}
class  retChild extends retParent{
    public String retfun(){
        String s = new String();
        System.out.println("object ret - child function");
        return s;
    }
}

/* paretn cls menthon cannot be final method
class finalover{
    public final void fun(){
        System.out.println("finalover parent");
    }
}
class finalChild(){
    public final void fun(){
        System.out.println("final chlid");
    }
}
*/

// overriding with var arg can't be overridden
class varCls{
    public void varFun(int i){
        System.out.println("var-fun parent ...");
    }
}
class varChlid extends varCls{
    public void varfun(int... i){
        System.out.println("var-fun child");
    }
}

public class overriding {
    public static void main(String[] args) {
        parent pobj = new child();
        pobj.m1();
        System.out.println(pobj.num); // based on object
        System.out.println(pobj.snum); // based on reference

        absChild abs = new absChild();
        abs.absfun();

        retParent rc = new retChild();
        rc.retfun();

        varChlid var = new varChlid();
      //  var.varFun(1,2,3);
    }
}
