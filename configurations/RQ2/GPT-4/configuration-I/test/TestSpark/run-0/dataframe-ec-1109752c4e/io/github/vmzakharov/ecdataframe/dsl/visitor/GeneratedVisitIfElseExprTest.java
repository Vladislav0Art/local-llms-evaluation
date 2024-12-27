package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr expr = new IfElseExpr();
        visitor.visitIfElseExpr(expr);
        assertEquals(IfElseExpr.class, expr.getClass());
    }

}