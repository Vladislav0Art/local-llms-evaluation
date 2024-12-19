package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitIfElseExpr {

    @Test
    public void visitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr expr = mock(IfElseExpr.class);
        when(expr.toString()).thenReturn("( x > 5 )");
        String actual = visitor.visit(expr);
        assert actual.equals("if ( x > 5 )\nx\nelse \npos\n");
    }

}