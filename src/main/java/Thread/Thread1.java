package Thread;

import java.io.Serializable;
import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread1.shutdown();
//        myThread.start();

    }
}
//class MyThread extends Thread{
//        public void run(){
//            for (int i = 0; i < 10000; i++) {
//                try {
//                    MyThread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("My Thread" + i);
//            }
//        }
//}

class MyThread1 extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("NewThread");
            try {
                MyThread1.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
            }
