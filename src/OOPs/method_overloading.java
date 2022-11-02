package OOPs;


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
        //con.fun(10,10);
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

    }
}
