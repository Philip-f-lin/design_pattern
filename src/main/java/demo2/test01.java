package demo2;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        while (true) {
            System.out.println("請輸入第一個數字");
            double firstNumber = sc.nextDouble();
            System.out.println("請輸入第二個數字");
            double secondNumber = sc.nextDouble();
            System.out.println("請輸入運算符號");
            String operation = sc.next();
            Operation oper = OperationFactory.creatOperation(operation);
            System.out.println(oper.getResult(firstNumber, secondNumber));
        }
    }


}
