package Garavskii;


import java.util.Scanner;

public class ht1 {

    static Scanner enter = new Scanner(System.in);



    public static void Calculator() {

        System.out.print("A = ");
        int a = enter.nextInt();
        System.out.print("B = ");
        int b = enter.nextInt();
        System.out.print("Choose a mathematical operation:\n1.A+B\n2.A+B+A*B\n3.A*B\n4.A:B\n5.A-B\n");

        int r = enter.nextInt();
        switch (r){
            case (1):
                int c = a + b;
                System.out.print("Your Result = " + c);
                break;
            case (2):
                c=  a + b+ a * b ;
                System.out.print("Your Result = " + c);
                break;
            case (3):
                c =  a * b;
                System.out.print("Your Result = " + c);
                break;
            case (4):
                c =  a/b;
                System.out.print("Your Result = " + c);
                break;
            case (5):
                c =  a-b;
                System.out.print("Your Result = " + c);
                break;


        }}

    public static void swap() {

        System.out.print("X = "  );
        int x = enter.nextInt();

        System.out.print("Y = ");
        int y = enter.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap X = " + x + "; Y = " + y);

    }



    //Итог

    public static void main(String[] args) {

        System.out.println("select the method you want to use :\n1.Greeting\n2.Calculator\n3.Permutation of numbers" );
        int z = enter.nextInt();
        switch (z) {
            case (1) -> {
                Greeting gree = new Greeting("my dear friend. Thank you for reading this");
                System.out.println("Hello " + gree.gr);
            }
            case (2) -> Calculator();
            case (3) -> swap();
        }

    }}
