package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToString_EmptyExpression_ReturnsEmptyString {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_EmptyExpression_ReturnsEmptyString() {
        Expression e = new Expression();
        assertEquals("", exprToString(e));
    }

}