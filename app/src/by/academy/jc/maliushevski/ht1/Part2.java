package by.academy.jc.maliushevski.ht1;

public class Part2 {
  public Part2() {
    System.out.println("Hello, Dear teacher!");
  }

  int toSummary(int a, int b){
    int result = a+b;
    return result;
  }

  void toDivide(int a, int b){
    if (b!=0) {
      int result = a/b;
      System.out.println(result); ;
    }
    else
      System.out.println("impossible to divide by zero");
  }

  void toSwap(int x, int y){
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("x="+x+" ,y="+y);
  }

}
