package com.jacksai.genos.expression.operation;

import com.jacksai.genos.expression.Expression;
import com.jacksai.genos.expression.ExpressionContext;
import com.jacksai.genos.expression.Literal;
import com.jacksai.genos.expression.Variable;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CubeTest {

    @Test
    public void shouldCubeLiteral(){
        // arrange
        Expression firstLiteral = new Literal(2.0);
        Expression adding = new Cube(firstLiteral);

        // act
        Double solution = adding.evaluate();

        // assert
        assertEquals(4.0, solution, 0.001);
    }

    @Test
    public void shouldCubeVariable() {
        // arrange
        HashMap<String, Double> variableList = new HashMap<>();
        variableList.put("X", 2.0);
        ExpressionContext expressionContext = new ExpressionContext(variableList);

        Expression variable = new Variable("X", expressionContext);

        Expression cubing = new Cube(variable);


        // act
        Double solution = cubing.evaluate();

        // assert
        assertEquals(4.0, solution, 0.001);
    }

}
