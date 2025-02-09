package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr expr = Mockito.mock(ProjectionExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitProjectionExpr(expr);
    }

}