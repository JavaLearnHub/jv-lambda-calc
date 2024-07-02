package lambda.practice.service;

import lambda.practice.service.operations.Operation;

public interface CalculatorInterface {
    public double calculate(double firstValue, double secondValue, Operation operation);
}
