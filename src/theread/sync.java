package theread;

class Counter {
    int count = 0;
    public synchronized void increment(){
        count+=1;
    }
}

public class sync {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        // 2 nd thread
        Runnable run  = () ->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t2 = new Thread(run);

        t2.start();
        t1.start();

        t1.join();

        System.out.println(c.count);
    }
}
