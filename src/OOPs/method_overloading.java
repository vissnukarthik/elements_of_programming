package OOPs;


class Animal{

}
class Monkey extends  Animal{

}
class Test extends Monkey{
    public void m1(Animal obj){
        System.out.println("animal object is called");
    }
    public void m1(Monkey obj){
        System.out.println("monkey object is called");
    }
}

class overloading_dataType{

    public void m1(float f){
        System.out.println("float");
    }
}
class convertable{
    public void fun(int i,float f){
        System.out.println("int - float");
    }
    public void fun(float f,int i){
        System.out.println("float - int");
    }
}


class overloading_obj{
    public void m1(Object obj){
        System.out.println("obj");
    }
    public void m1(StringBuffer sb){
        System.out.println("string buffer");
    }
    public void m1(String s){
        System.out.println("string");
    }
}

class ObjReference extends overloading_obj{
    public void fun(overloading_obj obj){
        System.out.println("overloading fun");
    }
    public void fun(convertable obj){
        System.out.println("converting fun");
    }
}

public class method_overloading {
    public static void main(String[] args) {
        convertable con = new convertable();
        // con.fun(10.5); 10.5 is double by default
        //con.fun(10,10);   // m1(45,45); ambigious will occur because of (int,float) and (float,int)
        con.fun(10,10.5f);

        overloading_obj obj = new overloading_obj();
        obj.m1(new Object());
        obj.m1("string");
        obj.m1(new StringBuffer());
        //obj.m1(null); // ambiguous will occur

        ObjReference obRef = new ObjReference();
        obRef.fun(obj);
        obRef.fun(con);

        // implement a parent - child
        overloading_obj parChild = new ObjReference();
        obRef.fun(parChild);

       /*
        System.out.println(45);
        System.out.println("this is karthik"); // this is as example of method overloading
        */

        // lower data type will convert to higer data type
        overloading_dataType dtype = new overloading_dataType();
        dtype.m1(55);

        Test testObj = new Test();
        Animal am = new Monkey();
        testObj.m1(am);
    }
}
