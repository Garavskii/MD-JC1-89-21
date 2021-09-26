package by.academy.jc.maliushevski.ht1;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Part2 homeTask1 = new Part2();

    Scanner sc = new Scanner(System.in);

    String enterFirstValue = "Please, enter values of x and y.\nEnter value of x:";
    System.out.println(enterFirstValue);
    int a = sc.nextInt();
    String enterSecondValue = "Enter value of y:";
    System.out.println(enterSecondValue);
    int b = sc.nextInt();

    System.out.println("The sum is: "+homeTask1.toSummary(a,b));
    System.out.print("The division x to y is: "); homeTask1.toDivide(a,b);
    System.out.print("The values after swapping are: "); homeTask1.toSwap(a,b);

    sc.close();
  }

}
