package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = new DecimalExpr(10);
        String result = PrettyPrintVisitor.exprToString(expression);
        assertEquals("10", result);
    }

}