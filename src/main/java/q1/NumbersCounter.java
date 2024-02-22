package q1;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersCounter {

    int number;

    public NumbersCounter(int number) {
        this.number = number;
    }

    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> sum = new ArrayList<>();

    public synchronized void countEven() {

        try {

            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {
                    even.add(i);
                }
            }

            System.out.println("even numbers :");
            System.out.println(even);




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized void countOdd() {

        try {


            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0) {
                    odd.add(i);
                }
            }

            System.out.println("odd numbers :");
            System.out.println(odd);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized void salam() {

        try {

            sum.addAll(even);
            sum.addAll(odd);

            Collections.sort(sum);

            System.out.println("sum :");
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
