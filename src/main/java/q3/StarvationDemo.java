package q3;

public class StarvationDemo extends Thread{
    static int threadcount = 0;
    public void run() {
        threadcount++;
        System.out.println(threadcount + "st Child Thread execution starts");
        System.out.println("Child thread execution completes");
    }

    public static  void main(String[] args) throws InterruptedException{

        System.out.println("Main thread execution starts");

        StarvationDemo thread1 = new StarvationDemo();
        thread1.setPriority(10);
        StarvationDemo thread2 = new StarvationDemo();
        thread2.setPriority(9);
        StarvationDemo thread3 = new StarvationDemo();
        thread3.setPriority(8);
        StarvationDemo thread4 = new StarvationDemo();
        thread4.setPriority(7);
        StarvationDemo thread5 = new StarvationDemo();
        thread5.setPriority(6);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();
        thread5.start();
        thread5.join();

        System.out.println("Main thread execution completes");
    }
}
