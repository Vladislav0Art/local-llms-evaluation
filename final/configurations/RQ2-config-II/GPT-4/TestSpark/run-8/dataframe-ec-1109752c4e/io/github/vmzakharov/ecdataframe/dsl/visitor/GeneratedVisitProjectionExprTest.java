package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        Expression expr = new ProjectionExpr(new VarExpr("a"), "newVar");
        assertEquals("a[newVar]", PrettyPrintVisitor.exprToString(expr));
    }

}