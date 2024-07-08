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
        return firstValue / secondValue;
    }

    @Override
    public double toPower(double base, double power) {
        return Math.pow(base, power);
    }
}
