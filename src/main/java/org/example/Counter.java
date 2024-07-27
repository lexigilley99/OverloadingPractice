package org.example;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    // Overloaded method that increases the value of the counter by the value of increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    // Overloaded method that decreases the value of the counter by the value of decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Counter 1: " + counter1.value());
        System.out.println("Counter 2: " + counter2.value());

        counter1.increase();
        counter2.increase(5);

        System.out.println("Counter 1 after increase by 1: " + counter1.value());
        System.out.println("Counter 2 after increase by 5: " + counter2.value());

        counter1.decrease();
        counter2.decrease(3);

        System.out.println("Counter 1 after decrease by 1: " + counter1.value());
        System.out.println("Counter 2 after decrease by 3: " + counter2.value());
    }
}

