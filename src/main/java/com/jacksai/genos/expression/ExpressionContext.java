package com.jacksai.genos.expression;

import java.util.HashMap;
import java.util.Map;

public class ExpressionContext {

    private Map<String, Double> expressionVariables;

    public ExpressionContext() {
        expressionVariables = new HashMap<>();
    }

    public ExpressionContext(Map<String, Double> expressionVariables) {
        this.expressionVariables = expressionVariables;
    }

    public Map<String, Double> getExpressionVariables() {
        return expressionVariables;
    }

    public void setExpressionVariables(Map<String, Double> expressionVariables) {
        this.expressionVariables = expressionVariables;
    }

    public Double getVariable(String variableName) {
        return expressionVariables.get(variableName);
    }
}
