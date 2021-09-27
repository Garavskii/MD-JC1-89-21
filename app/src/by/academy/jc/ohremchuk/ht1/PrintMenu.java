package by.academy.jc.ohremchuk.ht1;

import java.util.Scanner;

import static java.lang.System.exit;

public class PrintMenu {
    public void printMethods() {
        Scanner in = new Scanner(System.in);
        while (true) {
            Task.printInfo();
            System.out.println("Enter number");
            int selection = in.nextInt();
            switch (selection) {
                case 1:
                    Task task = new Task();
                    break;
                case 2: {
                    System.out.println("Enter a value: ");
                    int a = in.nextInt();
                    System.out.println("Enter b value: ");
                    int b = in.nextInt();
                    Task.calculateSum(a, b);
                    break;
                }
                case 3: {
                    System.out.println("Enter first num: ");
                    int x = in.nextInt();
                    System.out.println("Enter second: ");
                    int y = in.nextInt();
                    Task.swap(x, y);
                    break;
                }
                case 4:
                    exit(1);
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}

