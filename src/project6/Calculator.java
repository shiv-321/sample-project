package project6;

public class Calculator {
    public int add(int a, int b)throws InvalidInputException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (a==8 & b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    public int subtract(int a, int b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    public int multiply(int a, int b) throws MaxInputException, MaxMultiplierException{
        if (a>7000 || b>7000){
            throw new MaxMultiplierException();
        }
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a*b;
    }
    public int divide(int a, int b) throws MaxInputException, CannotDivideByZeroException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;

    }
}
