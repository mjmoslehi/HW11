package q3;

public class StarvationDemo extends Thread{
    static int threadcount = 0;
    public void run() {
        threadcount++;
        System.out.println(threadcount + "st Child Thread execution starts");
        System.out.println("Child thread execution completes");
    }
}
