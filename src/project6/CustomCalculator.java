package project6;
/**
    exercise 6: You have to create a custom calculator with following operation
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplicaiton
    4. / -> Division

    which throws the following exceptions:
    1. Invalid input Exception ex: 8 &9
    2. Cannot divide by 0 Exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

     */

public class CustomCalculator {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, MaxMultiplierException, CannotDivideByZeroException{

        Calculator c = new Calculator();
//        c.add(8, 9);
//        c.divide(6, 0);
        c.add(1000000, 100);
        c.multiply(8000, 2);
    }
}
