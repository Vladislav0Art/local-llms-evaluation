package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr expr = new IndexExpr();
        visitor.visitIndexExpr(expr);
        assertEquals(IndexExpr.class, expr.getClass());
    }

}