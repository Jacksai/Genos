package com.jacksai.genos.expression;

public class Literal extends Expression {

    private static final double INITIAL_VALUE = 0.0d;

    private final Double value;

    public Literal() {
        value = INITIAL_VALUE;
    }

    public Literal(Double value) {
        this.value = value;
    }


    @Override
    public double evaluate() {
        return value;
    }
}
