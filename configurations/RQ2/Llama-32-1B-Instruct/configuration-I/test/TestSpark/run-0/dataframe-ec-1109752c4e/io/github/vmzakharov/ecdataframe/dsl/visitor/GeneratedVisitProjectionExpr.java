package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitProjectionExpr {

    @Test
    public void visitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr expr = mock(ProjectionExpr.class);
        when(expr.toString()).thenReturn("( x )");
        String actual = visitor.visit(expr);
        assert actual.equals("x\n");
    }

}