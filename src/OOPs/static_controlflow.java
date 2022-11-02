package OOPs;

class kamal{
    static int i=0;
    static {
        m1();
        System.out.println("kamal first static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("kamal main");
    }
    public static void m1(){
        System.out.println(j);
    }
    static {
        System.out.println("kamal 2 nd static block");
    }
    static int j=10;
}

class shruthi extends kamal{
    static int x=0;
    static {
        m1();
        System.out.println("shruthi first static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("shruth main");
    }
    public static void m1(){
        System.out.println(y);
    }
    static {
        System.out.println("2 nd static block");
    }
    static int y=20;
}

public class static_controlflow {
    public static void main(String[] args) {
       // kamal k = new kamal();
    }
}
