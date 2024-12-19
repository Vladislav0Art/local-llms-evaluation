package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitVectorExpr {

    @Test
    public void visitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = mock(Expression.class);
        when(expr.toString()).thenReturn("[ 1 , 2 ]");
        String actual = visitor.visit(expr);
        assert actual.equals("x[ 1 , 2 ]\n");
    }

}