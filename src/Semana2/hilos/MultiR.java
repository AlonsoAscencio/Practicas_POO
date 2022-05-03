package Semana2.hilos;

public class MultiR {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task one");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task two");
            }
        };

        Thread t1 = new Thread(r1),
                t2 = new Thread(r2);

        t1.start();
        t2.start();
    }

}
