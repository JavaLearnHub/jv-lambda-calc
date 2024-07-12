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

    public static Operation getOperation(char value){
        for (Operation op : Operation.values()){
            if(op.value == value){
                return op;
            }
        }
        throw new UnsupportedOperationException();
    }

}
