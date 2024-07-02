package lambda.practice.service.operations;

public enum Operation {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    POWER('^'),
    DIVIDE('/');

    private final char value;

    Operation(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
