package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expr = new VarExpr(new ExprContext(), "variable");
        String outStr = PrettyPrintVisitor.exprToString(expr);
        assertEquals("variable", outStr);
    }

}