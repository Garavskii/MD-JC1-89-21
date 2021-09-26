package by.academy.jc.Zhenya.ht1;

import by.academy.jc.Zhenya.ht1.counting.WorkingWithNumbers;

public class HomeTask1 {
    public static void main(String[] args) {

        WorkingWithNumbers test = new WorkingWithNumbers();

        System.out.println("\n--- One method ---");

        for (int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);

            test.printNumbers(a, b);
            test.printResult(test.sumNumbersPlusCompositionNumbers(a, b));
        }

        System.out.println("\n--- Two method ---");

        for (int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);

            test.printNumbers(a,b);
            System.out.println("Swap :");
            test.swapNumbers(a,b);
        }

    }
}
