package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;

public class GeneratedExprToStringDecimalExprTest {

    @Test
    public void exprToStringDecimalExprTest() {
        DecimalExpr decimalExpr = new DecimalExpr(null, new ConstantExpression(null, 10.0));
        String output = PrettyPrintVisitor.exprToString(decimalExpr);
        assertEquals("DECIMAL ", output.trim());
    }

}