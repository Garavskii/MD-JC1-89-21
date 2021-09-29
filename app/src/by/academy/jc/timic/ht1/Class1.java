package by.academy.jc.timic.ht1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

    Class2 s = new Class2();

        /*
        Reading two variables
        */

    System.out.println("Enter x and y for working");
    System.out.print("x = ");
    Scanner nx = new Scanner(System.in);
    int x = nx.nextInt();
    System.out.print("y = ");
    Scanner ny = new Scanner(System.in);
    int y = ny.nextInt();

        /*
        Output String
         */
    System.out.println(s.OutString());

        /*
        task 2
         */
    System.out.println("Summ result1 = " + s.Summ(x,y));
    System.out.println("Summ result2 = " + s.Summ(x-3504,y+4681));
    System.out.println("Summ result3 = " + s.Summ(x+544444,0));

    System.out.println("Div result1 = " + s.Div(x+584,y*88));         // bug
    System.out.println("Div result1 = " + s.Div(x,0));
    System.out.println("Div result1 = " + s.Div(x-85,x+5));

        /*
        task 3
        */
    System.out.println("Swapping result: ");
    s.Swap(x, y);
}
}
