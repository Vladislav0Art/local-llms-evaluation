package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToString_SimpleValue_ReturnsCorrectString {

    @Test
    public void exprToString_SimpleValue_ReturnsCorrectString() {
        Expression expr = new Value("10");
        String result = PrettyPrintVisitor.exprToString(expr);
        assertEquals("10", result);
    }

}