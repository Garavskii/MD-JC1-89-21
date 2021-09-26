package by.academy.jc.sandris_h.ht1;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperation arOperation = new ArithmeticOperation();
        for (int i = 0; i < 3; i++) {
            int x = (int) (Math.random() * 9 + 1);
            int y = (int) (Math.random() * 9 + 1);

            int sumOfSumAndProduct = arOperation.sumOfSumAndProduct(x, y);
            System.out.println("x = " + x + "; y = " + y + ";");
            System.out.println("sumOfSumAndProduct(x; y) = " + sumOfSumAndProduct + ";");

            double division = arOperation.division(x, y);
            System.out.print("division(x; y) = ");
            System.out.printf("%.3f;\n", division);

            arOperation.exchangeOfValues(x, y);
            System.out.println();
        }
    }
}
