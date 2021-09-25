package by.academy.jc.artzvrzn.ht1;

public class Class1 {

  public static void main(String[] args) {

    Class2 c2 = new Class2();

    System.out.println(c2.sumPlusProduct(4, 5));
    System.out.println(c2.sumPlusProduct(-9, 2));
    System.out.println(c2.sumPlusProduct(10, 0));

    System.out.println(c2.square(10));
    System.out.println(c2.square(6));
    System.out.println(c2.square(10));

    c2.swapIntegers(10, 30);
    c2.swapIntegers(1, 0);
    c2.swapIntegers(20, -300);


  }

}
