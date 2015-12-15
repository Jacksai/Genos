package com.jacksai.genos.expression;

public abstract class Expression {

    private ExpressionContext expressionContext;

    public Expression() {}

    public Expression(ExpressionContext expressionContext) {
        this.expressionContext = expressionContext;
    }

    public abstract double evaluate() throws RuntimeException;

    public Double getVariable(String variableName) {
        return expressionContext.getVariable(variableName);
    }

    public void setExpressionContext(ExpressionContext expressionContext) {
        this.expressionContext = expressionContext;
    }
}
