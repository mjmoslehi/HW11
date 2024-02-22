package q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter your number : ");
        int number = 10;

        NumbersCounter numbersCounter = new NumbersCounter(number);

        Thread tOdd = new Thread(new Runnable() {
            @Override
            public void run() {
                numbersCounter.countOdd();

            }
        });

        Thread tEven = new Thread(new Runnable() {
            @Override
            public void run() {
                numbersCounter.countEven();
            }
        });

        Thread tSum = new Thread(new Runnable() {
            @Override
            public void run() {
                numbersCounter.salam();
            }
        });


        tEven.start();
        tEven.join();
        tOdd.start();
        tOdd.join();
        tSum.start();
        tSum.join();

    }
}
