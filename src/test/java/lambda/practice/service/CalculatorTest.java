package lambda.practice.service;

import lambda.practice.service.operations.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private CalculatorInterface calculator = new Calculator();

    @Test
    void calculateSum_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.PLUS);
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateSum_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.PLUS);
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateSum_onePositiveOneNegativeValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.PLUS);
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateSum_zeroValues() {
        double firstValue = 0;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.PLUS);
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateSum_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.PLUS);
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateDifference_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MINUS);
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateDifference_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MINUS);
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateDifference_oneNegativeOnePositiveValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MINUS);
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateDifference_onePositiveOneNegativeValues() {
        double firstValue = 57.3;
        double secondValue = -42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MINUS);
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateDifference_zeroValues() {
        double firstValue = 0;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MINUS);
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateDifference_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MINUS);
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateProduct_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MULTIPLY);
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateProduct_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MULTIPLY);
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateProduct_onePositiveOneNegativeValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MULTIPLY);
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateProduct_zeroValues() {
        double firstValue = 0;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MULTIPLY);
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, delta);
    }

    void calculateProduct_oneZeroOnePositiveValues() {
        double firstValue = 80.4;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MULTIPLY);
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateProduct_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.MULTIPLY);
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateQuotient_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.DIVIDE);
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateQuotient_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.DIVIDE);
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateQuotient_onePositiveOneNegativeValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.DIVIDE);
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateQuotient_zeroDividedByPositiveValue() {
        double firstValue = 0;
        double secondValue = 50.0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.DIVIDE);
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, delta);
    }

    void calculateQuotient_divisionByZeroValue() {
        double firstValue = 80.4;
        double secondValue = 0;
        assertThrows(ArithmeticException.class, () ->
                calculator.calculate(firstValue, secondValue, Operation.DIVIDE));
    }

    @Test
    void calculateQuotient_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.DIVIDE);
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_positiveToPositivePower() {
        double firstValue = 10;
        double secondValue = 2;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_negativeToPositivePower() {
        double firstValue = -10;
        double secondValue = 2;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_positiveToNegativePower() {
        double firstValue = 10;
        double secondValue = -2;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_negativeToNegativePower() {
        double firstValue = -10;
        double secondValue = -2;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_positiveToZeroPower() {
        double firstValue = 10;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_negativeToZeroPower() {
        double firstValue = -10;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_zeroToPositivePower() {
        double firstValue = 0;
        double secondValue = 8;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePower_zeroToZeroPower() {
        double firstValue = 0;
        double secondValue = 0;
        double delta = 0.0001;
        double actual = calculator.calculate(firstValue, secondValue, Operation.POWER);
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, delta);
    }

    @Test
    void calculateIllegalOperation() {
        double firstValue = 1;
        double secondValue = 2;
        assertThrows(RuntimeException.class, () -> calculator.calculate(firstValue, secondValue, null));
    }

}