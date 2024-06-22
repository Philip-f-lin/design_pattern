package demo2;

public class OperationFactory {
    public static Operation creatOperation(String operation){
        Operation oper = null;
        if(!"*".equals(operation) && !"/".equals(operation) && !"-".equals(operation) && !"+".equals(operation)){
            System.out.println("運算符號輸入錯誤");
            return null;
        }
        switch (operation) {
            case "*":
                oper = new Multiply();
                break;
            case "/":
                oper = new Divide();
                break;
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Minus();
        }
        return oper;
    }
}
