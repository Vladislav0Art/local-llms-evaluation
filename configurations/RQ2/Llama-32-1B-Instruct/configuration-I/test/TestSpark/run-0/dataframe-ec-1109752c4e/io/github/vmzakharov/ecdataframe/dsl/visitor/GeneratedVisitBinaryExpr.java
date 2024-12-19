package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitBinaryExpr {

    @Test
    public void visitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = mock(Expression.class);
        when(expr.toString()).thenReturn("( x + y )");
        String actual = visitor.visit(expr);
        assert actual.equals("\n x + y \n");
    }

}