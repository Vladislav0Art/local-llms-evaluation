package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = new Expression() {
            @Override
            public String toString() {
                return "testExpression";
            }
        };
        when(expression.toString()).thenReturn("testExpression");
        String result = PrettyPrintVisitor.exprToString(expression);
        assertEquals("testExpression", result);
    }

}