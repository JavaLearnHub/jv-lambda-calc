package lambda.practice.service;

import lambda.practice.service.operations.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final CalculatorInterface calculator = new Calculator();
    private static final Double DELTA = 0.001;

    @Test
    void calculateSum_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '+');
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateSum_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double actual = calculator.calculate(firstValue, secondValue, '+');
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateSum_onePositiveOneNegativeValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '+');
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateSum_zeroValues() {
        double firstValue = 0;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '+');
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateSum_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double actual = calculator.calculate(firstValue, secondValue, '+');
        double expected = firstValue + secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateDifference_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '-');
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateDifference_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double actual = calculator.calculate(firstValue, secondValue, '-');
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateDifference_oneNegativeOnePositiveValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '-');
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateDifference_onePositiveOneNegativeValues() {
        double firstValue = 57.3;
        double secondValue = -42.7;
        double actual = calculator.calculate(firstValue, secondValue, '-');
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateDifference_zeroValues() {
        double firstValue = 0;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '-');
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateDifference_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double actual = calculator.calculate(firstValue, secondValue, '-');
        double expected = firstValue - secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateProduct_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '*');
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateProduct_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double actual = calculator.calculate(firstValue, secondValue, '*');
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateProduct_onePositiveOneNegativeValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '*');
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateProduct_zeroValues() {
        double firstValue = 0;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '*');
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, DELTA);
    }

    void calculateProduct_oneZeroOnePositiveValues() {
        double firstValue = 80.4;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '*');
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateProduct_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double actual = calculator.calculate(firstValue, secondValue, '*');
        double expected = firstValue * secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateQuotient_positiveValues() {
        double firstValue = 57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '/');
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateQuotient_negativeValues() {
        double firstValue = -57.3;
        double secondValue = -42.7;
        double actual = calculator.calculate(firstValue, secondValue, '/');
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateQuotient_onePositiveOneNegativeValues() {
        double firstValue = -57.3;
        double secondValue = 42.7;
        double actual = calculator.calculate(firstValue, secondValue, '/');
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateQuotient_zeroDividedByPositiveValue() {
        double firstValue = 0;
        double secondValue = 50.0;
        double actual = calculator.calculate(firstValue, secondValue, '/');
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, DELTA);
    }

    void calculateQuotient_divisionByZeroValue() {
        double firstValue = 80.4;
        double secondValue = 0;
        assertThrows(ArithmeticException.class, () ->
                calculator.calculate(firstValue, secondValue, '/'));
    }

    @Test
    void calculateQuotient_minMaxValues() {
        double firstValue = Double.MAX_VALUE;
        double secondValue = Double.MIN_VALUE;
        double actual = calculator.calculate(firstValue, secondValue, '/');
        double expected = firstValue / secondValue;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_positiveToPositivePower() {
        double firstValue = 10;
        double secondValue = 2;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_negativeToPositivePower() {
        double firstValue = -10;
        double secondValue = 2;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_positiveToNegativePower() {
        double firstValue = 10;
        double secondValue = -2;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_negativeToNegativePower() {
        double firstValue = -10;
        double secondValue = -2;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_positiveToZeroPower() {
        double firstValue = 10;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_negativeToZeroPower() {
        double firstValue = -10;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_zeroToPositivePower() {
        double firstValue = 0;
        double secondValue = 8;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculatePower_zeroToZeroPower() {
        double firstValue = 0;
        double secondValue = 0;
        double actual = calculator.calculate(firstValue, secondValue, '^');
        double expected = Math.pow(firstValue, secondValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateIllegalOperation() {
        double firstValue = 1;
        double secondValue = 2;
        assertThrows(UnsupportedOperationException.class, () -> calculator.calculate(firstValue, secondValue, '='));
    }

}