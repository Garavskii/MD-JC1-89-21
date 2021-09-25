package by.academy.jc.artzvrzn.ht1;

public class Class2 {

  public Class2() {

    // method 1 (constructor)

    System.out.println("Greetings! Class2 initialized.");

  }

  public int sumPlusProduct(int a, int b) {

    // method 2

    return (a + b) + a * b;

  }

  public int square(int a) {

    // squares a received number (a)

    return a * a;

  }

  public void swapIntegers(int a, int b) {

    // method 3

    b = b - a;
    a = a + b;
    b = a - b;

    System.out.printf("a = %d b = %d\n", a, b);

  }

}
