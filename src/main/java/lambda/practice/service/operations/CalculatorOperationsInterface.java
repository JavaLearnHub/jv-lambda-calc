package lambda.practice.service.operations;

public interface CalculatorOperationsInterface {
    double add(double firstTerm, double secondTerm);

    double subtract(double minuend, double subtrahend);

    double multiply(double firstMultiplier, double secondMultiplier);

    double divide(double dividend, double divisor);

    double toPower(double base, double power);

}
