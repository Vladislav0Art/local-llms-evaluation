package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = new AssingExpr("x", 1);
        String str = PrettyPrintVisitor.exprToString(expression);
        assertEquals("x = 1", str);
    }

}