package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitAliasExpr {

    @Test
    public void visitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr expr = mock(ProjectionExpr.class);
        when(expr.toString()).thenReturn("( x )");
        String actual = visitor.visit(expr);
        assert actual.equals("\n x\n");
    }

}