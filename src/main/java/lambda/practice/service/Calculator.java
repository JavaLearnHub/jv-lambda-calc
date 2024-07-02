package lambda.practice.service;

import lambda.practice.service.operations.CalculatorOperations;
import lambda.practice.service.operations.Operation;

public class Calculator implements CalculatorInterface {
    private static final CalculatorOperations CALCULATOR_OPERATIONS = new CalculatorOperations();

    @Override
    public double calculate(double firstValue, double secondValue, Operation operation) {
        return switch (operation) {
            case PLUS -> CALCULATOR_OPERATIONS.add(firstValue, secondValue);
            case MINUS -> CALCULATOR_OPERATIONS.subtract(firstValue, secondValue);
            case MULTIPLY -> CALCULATOR_OPERATIONS.multiply(firstValue, secondValue);
            case DIVIDE -> CALCULATOR_OPERATIONS.divide(firstValue, secondValue);
            case POWER -> CALCULATOR_OPERATIONS.toPower(firstValue, secondValue);
            default -> throw new RuntimeException("Unknown operation: " + operation);
        };
    }
}
