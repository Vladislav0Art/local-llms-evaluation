package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitAnonymousScriptExpr {

    @Test
    public void visitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = mock(Expression.class);
        when(expr.toString()).thenReturn("( x + y )");
        visitor.visitAnonymousScriptExpr(expr);
        verify(expr, times(1)).toString();
    }

}