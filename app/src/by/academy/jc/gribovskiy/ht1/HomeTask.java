package by.academy.jc.gribovskiy.ht1;

public class HomeTask {

  public HomeTask() {
    System.out.println("HELLO!");
  }

  public int additionAndMultiplication(int numberOne, int numberTwo) {
    return numberOne + numberTwo + numberOne * numberTwo;
  }

  public void replacement(int numberOne, int numberTwo) {
    numberOne = numberOne + numberTwo;
    numberTwo = numberOne - numberTwo;
    numberOne = numberOne - numberTwo;
    System.out.printf("Результат выполнения замены.%n" +
        "Первое число: %d, второе число: %d%n", numberOne, numberTwo);
  }
}
