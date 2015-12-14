package com.jacksai.expression;

import org.junit.Test;

import static org.junit.Assert.*;

public class LiteralTest {

    @Test
    public void shouldReturnCorrectLiteral() throws RuntimeException {
        // arrange
        Expression expression = new Literal(2.0d);

        // act
        Double solution = expression.evaluate();

        // assert
        assertEquals(2.0d, solution, 0.0001);
    }

    @Test
    public void souldInitializeWithZeroValue() {
        // arrange
        Expression literal = new Literal();

        // act
        Double solution = literal.evaluate();

        // assert
        assertEquals(0.0d, solution, 0.001);
    }

}