package com.jacksai.expression;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class VariableTest {

    private ExpressionContext expressionContext;

    @Before
    public void setUp() {
        HashMap<String, Double> variableMap = new HashMap<>();
        variableMap.put("X", 4.0);
        variableMap.put("Y", 12.0);
        expressionContext = new ExpressionContext(variableMap);
    }

    @Test
    public void shouldReturnValueFromContext() throws RuntimeException {
        // arrange
        Expression variableExpression = new Variable("X");
        variableExpression.setExpressionContext(expressionContext);

        // act
        Double solution = variableExpression.evaluate();

        // assert
        assertEquals(4.0, solution, 0.1);
    }

    @Test
    public void shouldThrowVariableNotFoundExceptionWhenNoVariableSet() {
        // arrange
        Variable variableExpression = new Variable("A");
        variableExpression.setExpressionContext(expressionContext);

        try {
            //act
            variableExpression.evaluate();
            fail("Should throw exception");
        } catch (RuntimeException ex) {
            // assert
            assertEquals("Variable A not found", ex.getMessage());
        }
    }
}