package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr expr = new UnaryExpr();
        visitor.visitUnaryExpr(expr);
        assertEquals(UnaryExpr.class, expr.getClass());
    }

}