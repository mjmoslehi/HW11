package q1;

import java.util.ArrayList;

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
}
