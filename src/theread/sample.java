package theread;

import javax.crypto.Mac;

// runnable interface
class MyThread implements Runnable{
    public void run(){
        System.out.println("this is runnable implemented thread");
    }
}

class hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try {Thread.sleep(100);}catch (Exception e){}
        }
    }
}
// this method is class extend method
class hello extends  Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("hello");
            try {Thread.sleep(100);}catch (Exception e){}
        }
    }
}
public class sample {
    public static void main(String[] args) throws Exception {

        hi hi_obj = new hi();
        hello hello_obj = new hello();

        hi_obj.setName("hi - thread");
        hello_obj.setName("hello - thread");

        hi_obj.setPriority(1); // min priority
        hello_obj.setPriority(10); // max priority
        System.out.println(hi_obj.getName() +  "priority --> " + hi_obj.getPriority()); // 5 is default priority(normal)
        System.out.println(hello_obj.getName() + "priorit --> "+ hello_obj.getPriority());

        hi_obj.start();
       // try {Thread.sleep(100);}catch (Exception e){}
        hello_obj.start();

        hi_obj.join();
        hello_obj.join();

        System.out.println("bye ");

/*
        //runnable interface
        Runnable run_t = new MyThread();
        Thread  t = new Thread(run_t);
        t.start();

        Runnable lambda_obj = () -> {
            System.out.println("this lambda expression ");
        }; // https://stackov   erflow.com/questions/9625110/how-to-start-anonymous-thread-class
           // https://www.tutorialspoint.com/how-to-implement-the-runnable-interface-using-lambda-expression-in-java
        Thread lt = new Thread(lambda_obj);
        lt.start();
 */
       // Yield
        Thread yield_obj1 = new Yield(); yield_obj1.setName("yield 1- thread");
        Thread yield_obj2 = new Yield(); yield_obj2.setName("yield 2- thread"); yield_obj2.setPriority(10);
        yield_obj1.start();
        yield_obj2.start();

        for(int i=0;i<3;i++){
            yield_obj2.yield();
            System.out.println(Thread.currentThread());
        }

    }
}

class Yield extends Thread{

    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread());
        }
    }
}