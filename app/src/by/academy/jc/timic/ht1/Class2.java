package by.academy.jc.timic.ht1;

public class Class2 {
    public static String OutString(){
        String s = "Hello everybody";
        return s;
    }

    public static int Summ(int a, int b){
        return a + b + a * b;
    }

    public static double Div(int a, int b){
        if (b == 0) {
            System.out.println("Сannot be divided by 0");
            return 0;
        }else {
            double d = a/b;
            return d;
        }
    }

    public static void Swap(int a, int b){
        a = a+b;
        b = b-a;
        b = -b;
        a = a-b;
        System.out.println("After swaps:");
        System.out.println("x = " + a);
        System.out.println("y = " + b);
    }
}
