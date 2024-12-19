package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitUnaryExpr {

    @Test
    public void visitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = mock(Expression.class);
        when(expr.toString()).thenReturn("x - 5");
        String actual = visitor.visit(expr);
        assert actual.equals("\nx - 5 \n");
    }

}