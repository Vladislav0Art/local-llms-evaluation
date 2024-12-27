package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr expr = new ProjectionExpr();
        visitor.visitProjectionExpr(expr);
        assertEquals(ProjectionExpr.class, expr.getClass());
    }

}