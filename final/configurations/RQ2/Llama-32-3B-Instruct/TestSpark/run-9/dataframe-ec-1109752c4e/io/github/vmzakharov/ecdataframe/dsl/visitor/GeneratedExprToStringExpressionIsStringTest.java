package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedExprToStringExpressionIsStringTest {

    @Test
    public void exprToStringExpressionIsStringTest() {
        Expression expression = new Expression();
        String result = PrettyPrintVisitor.exprToString(expression);
        assertNotNull(result);
    }

}