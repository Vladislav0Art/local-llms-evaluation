package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        DecimalExpr decimalExpr = new DecimalExpr(null, 10.0);
        String output = PrettyPrintVisitor.exprToString(decimalExpr);
        assertEquals("DECIMAL ", output.trim());
    }

}