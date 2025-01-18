package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dsl.*;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = new VarExpr("testVar", false);
        String result = PrettyPrintVisitor.exprToString(expression);
        assertEquals("testVar", result);
    }

}