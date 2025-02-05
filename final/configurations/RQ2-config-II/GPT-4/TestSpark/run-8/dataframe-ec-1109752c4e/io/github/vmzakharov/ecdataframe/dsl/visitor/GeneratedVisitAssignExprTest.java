package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr("a", new DecimalExpr(10));
        assertEquals("a = 10", PrettyPrintVisitor.exprToString(expr));
    }

}