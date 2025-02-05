package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(new DecimalExpr(10), "+", new DecimalExpr(20));
        assertEquals("(10 + 20)", PrettyPrintVisitor.exprToString(expr));
    }

}