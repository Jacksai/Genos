package com.jacksai.genos.expression.operation;

import com.jacksai.genos.expression.Expression;

public class Cube extends OneArgumentOperation {


    public Cube(Expression argument) {
        super(argument);
    }

    @Override
    public double evaluate() throws RuntimeException {
        Double value = getArgument().evaluate();
        return value * value ;
    }
}
