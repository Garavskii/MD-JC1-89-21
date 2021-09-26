package by.academy.jc.gribovskiy.ht1;

public class Solution {

  public static void main(String[] args) {
    HomeTask homeTask = new HomeTask();

    for (int i = 0; i < 3; i++) {
      int numberOne = (int) (Math.random() * 100);
      int numberTwo = (int) (Math.random() * 100);
      System.out.printf("Первое число: %d, второе число: %d%n", numberOne, numberTwo);
      System.out.printf("Результат вычисления (%1$d + %2$d) + %1$d * %2$d = %3$d%n",
          numberOne, numberTwo, homeTask.additionAndMultiplication(numberOne, numberTwo));
      System.out.println("-------------------------------------------------");
    }
    System.out.println();
    for (int i = 0; i < 3; i++) {
      int numberOne = (int) (Math.random() * 100);
      int numberTwo = (int) (Math.random() * 100);
      System.out.printf("Первое число: %d, второе число: %d%n", numberOne, numberTwo);
      homeTask.replacement(numberOne, numberTwo);
      System.out.println("----------------------------------------");
    }
  }

}
