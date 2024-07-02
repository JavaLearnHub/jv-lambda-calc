package lambda.practice.service.operations;

public class CalculatorOperations implements CalculatorOperationsInterface {
    @Override
    public double add(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public double subtract(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    @Override
    public double multiply(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    @Override
    public double divide(double firstValue, double secondValue) {
        try {
            return firstValue / secondValue;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    @Override
    public double toPower(double firstValue, double secondValue) {
        return Math.pow(firstValue, secondValue);
    }
}
