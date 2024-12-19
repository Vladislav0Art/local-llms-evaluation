package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionCallExpr {

    @Test
    public void visitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = mock(Expression.class);
        when(expr.toString()).thenReturn("( x + y )");
        visitor.visitFunctionCallExpr(expr);
        verify(expr, times(2)).toString();
    }

}