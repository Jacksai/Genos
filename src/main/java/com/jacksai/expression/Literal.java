package com.jacksai.expression;

public class Literal extends Expression {

    private final Double value;

    public Literal() {
        value = 0.0;
    }

    public Literal(Double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
