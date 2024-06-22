package demo2;

public class Divide extends Operation{
    @Override
    public double getResult(double firstNumber, double secondNumber) {
        if(secondNumber == 0){
            System.out.println("除數不能為0");
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }
}
