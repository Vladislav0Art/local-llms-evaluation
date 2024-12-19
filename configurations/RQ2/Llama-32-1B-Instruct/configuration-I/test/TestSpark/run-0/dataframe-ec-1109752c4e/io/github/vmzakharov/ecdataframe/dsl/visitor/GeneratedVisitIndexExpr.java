package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitIndexExpr {

    @Test
    public void visitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr expr = mock(IndexExpr.class);
        when(expr.toString()).thenReturn(" x [ 1 ]");
        String actual = visitor.visit(expr);
        assert actual.equals("x[ 1 ]\n");
    }

}