package by.academy.jc.Oganian.ht1;

public class sayHello {
    public static void main(String[] args) {
        Class2 class2 = new Class2();

        System.out.println(class2.prodProd(31,6));
        System.out.println(class2.prodProd(7,-22));
        System.out.println(class2.prodProd(-63,9));

        class2.swapSwap(3,17);
        class2.swapSwap(34,89);
        class2.swapSwap(45,87);
    }
}
class Class2 {
    public Class2() {
        System.out.println("Доброго времени суток, Алексей!");
    }
    public int prodProd(int x, int y) {
        return x*y;
    }
    public void swapSwap(int x, int y) {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.printf("x = %d y = %d\n", x, y);
    }
}