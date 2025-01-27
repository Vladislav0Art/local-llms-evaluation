package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedExprToStringNullExpressionReturnsNullTest {

    @Test
    public void exprToStringNullExpressionReturnsNullTest() {
        Expression expression = null;
        String result = PrettyPrintVisitor.exprToString(expression);
        assertNull(result);
    }

}