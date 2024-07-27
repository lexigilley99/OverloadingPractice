package org.example;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Counter 1: " + counter1.value());
        System.out.println("Counter 2: " + counter2.value());

        counter1.increase();
        counter2.increase(5);

        System.out.println("Counter 1 increase by 1: " + counter1.value());
        System.out.println("Counter 2 increase by 5: " + counter2.value());

        counter1.decrease();
        counter2.decrease(3);

        System.out.println("Counter 1 decrease by 1: " + counter1.value());
        System.out.println("Counter 2 decrease by 3: " + counter2.value());

        counter1.increase(-1);
        counter2.decrease(-2);

        System.out.println("Counter 1 attempting to increase by -1: " + counter1.value());
        System.out.println("Counter 2 attempting to decrease by -2: " + counter2.value());
    }
}
