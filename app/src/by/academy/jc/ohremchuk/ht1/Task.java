package by.academy.jc.ohremchuk.ht1;

public class Task {
    public Task() {
        System.out.println("Hello from task 1");
    }

    public static void calculateSum(int x, int y) {
        System.out.println("first num: " + x + "; Second num: " + y);
        int sum = x + y;
        int multiply = x * y;
        int result = sum + multiply;
        System.out.println(" (x + y) + x * y = " + result);
    }

    public static void swap(int a, int b) {
        System.out.println("a = " + a + "; b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap a = " + a + "; b = " + b);
        System.out.println("-----------------");
    }

    public static void printInfo() {
        System.out.println("--- select: ---");
        System.out.println("1. Show info from constructor");
        System.out.println("2. Calculate Sum method");
        System.out.println("3. Swap method");
        System.out.println("4. Exit");
    }
}

