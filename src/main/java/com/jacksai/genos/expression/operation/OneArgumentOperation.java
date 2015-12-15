package com.jacksai.genos.expression.operation;

import com.jacksai.genos.expression.Expression;
import com.jacksai.genos.expression.ExpressionContext;

public abstract class OneArgumentOperation extends Expression {

    private Expression argument;

    public OneArgumentOperation(Expression argument) {
        this.argument = argument;
    }

    public OneArgumentOperation(Expression argument, ExpressionContext context) {
        super(context);
    }

    public Expression getArgument() {
        return argument;
    }

    public void setArgument(Expression argument) {
        this.argument = argument;
    }

}
