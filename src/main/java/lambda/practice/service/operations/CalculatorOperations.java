package lambda.practice.service.operations;

public class CalculatorOperations implements CalculatorOperationsInterface {
    @Override
    public double add(double firstTerm, double secondTerm) {
        return firstTerm + secondTerm;
    }

    @Override
    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    @Override
    public double multiply(double firstMultiplier, double secondMultiplier) {
        return firstMultiplier * secondMultiplier;
    }

    @Override
    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    @Override
    public double toPower(double base, double power) {
        return Math.pow(base, power);
    }
}
