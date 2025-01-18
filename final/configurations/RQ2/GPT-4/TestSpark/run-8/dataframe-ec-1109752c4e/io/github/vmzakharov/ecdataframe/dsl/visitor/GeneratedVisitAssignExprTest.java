package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr(null, "x", new DecimalExpr(null, 10.0));
        String output = PrettyPrintVisitor.exprToString(assignExpr);
        assertEquals("x = DECIMAL", output.trim());
    }

}