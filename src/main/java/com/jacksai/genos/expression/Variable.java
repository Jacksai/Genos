package com.jacksai.genos.expression;

public class Variable extends Expression {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    public Variable(String name, ExpressionContext context) {
        super(context);
        this.name = name;
    }

    @Override
    public double evaluate() throws RuntimeException {
        Double solution = getVariable(name);
        if(solution == null) {
            throw new RuntimeException("Variable " + name + " not found");
        }

        return solution;
    }
}
