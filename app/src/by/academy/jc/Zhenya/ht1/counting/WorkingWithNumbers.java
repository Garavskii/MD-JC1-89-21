package by.academy.jc.Zhenya.ht1.counting;

public class WorkingWithNumbers {

    private String name;

    public WorkingWithNumbers(){
        this.name = "Hello";
        System.out.println(getName());
    }

    public WorkingWithNumbers(String name){
        this.name = name;
    }

    public int sumNumbersPlusCompositionNumbers(int numberOne, int numberTwo){
        return sumNumbers(numberOne,numberTwo) +
                compositionNumbers(numberOne,numberTwo);
    }

    public int sumNumbers (int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public int compositionNumbers (int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public void swapNumbers (int numberOne, int numberTwo){
        numberOne +=numberTwo;
        numberTwo = numberOne-numberTwo;
        numberOne = numberOne-numberTwo;

        printNumbers(numberOne,numberTwo);
    }

    public void printNumbers(int numberOne, int numberTwo) {
        System.out.println("NumberOne: " + numberOne + "\n" +
                "NumberTwo: " + numberTwo + "\n");
    }

    public void printResult(int value){
        System.out.println("Result = " + value + "\n");
    }

    public String getName(){
        return name;
    }
}
