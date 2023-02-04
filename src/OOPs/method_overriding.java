package OOPs;


// in overriding reducing the scope of access modifier is not allowed oth
class A1{
    private void fun(){
        System.out.println("fun in A");
    }
}
class B1 extends A1{
     void fun(){
        System.out.println("fun in B");
    }
}


class  Parents{
    public  void  property(){
        System.out.println("what they have");
    }
    public void marry(){
        System.out.println("arrange");
    }
}
class Children extends Parents{
    public void marry(){
        System.out.println("own marriage");
    }
}
public class method_overriding {
    public static void main(String[] args) {

        Parents childObj = new Children();
        childObj.marry();

        B1 aobj = new B1();
        aobj.fun();
    }
}
