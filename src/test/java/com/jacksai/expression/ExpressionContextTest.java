package com.jacksai.expression;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ExpressionContextTest {

    @Test
    public void shouldInitializeHashMapWithVariables() {
        // act
        ExpressionContext expressionContext = new ExpressionContext();

        // assert
        assertNotNull(expressionContext.getExpressionVariables());
    }

    @Test
    public void shouldUseHashMapWithVariablesFromConstructor() {
        // arrange
        HashMap<String, Double> variablesList = new HashMap<>();
        variablesList.put("X", 10.0);

        // act
        ExpressionContext expressionContext = new ExpressionContext(variablesList);

        // assert
        assertEquals(10.0, expressionContext.getVariable("X"), 0.001);
    }

    @Test
    public void shouldBeAbleToSetNewExpressionVariables() {
        // arrange
        HashMap<String, Double> oldVariables = new HashMap<>();
        oldVariables.put("X", 10.0);

        HashMap<String, Double> newVariables = new HashMap<>();
        newVariables.put("X", 5.0);

        // act
        ExpressionContext expressionContext = new ExpressionContext(oldVariables);
        expressionContext.setExpressionVariables(newVariables);
        Double valueOfX = expressionContext.getVariable("X");

        // assert
        assertEquals(5.0, valueOfX, 0.001);
    }



}