package by.academy.jc.sandris_h.ht1;


public class ArithmeticOperation {

    public ArithmeticOperation() {
        System.out.println("Hello! You have created an object of class ArithmeticOperation.");
    }

    public int sumOfSumAndProduct(int x, int y) {
        int sum = x + y;
        int product = x * y;
        return sum + product;
    }

    public double division(int x, int y) {
        return 1.0 * x / y;
    }


    @SuppressWarnings("SuspiciousNameCombination")
    public void exchangeOfValues(int x, int y) {
        x = x + y - (y = x);
        System.out.print("exchangeOfValues(x, y): ");
        System.out.print("x = " + x + "; ");
        System.out.println("y = " + y + ";");
    }

}
