package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitDecimalExpr {

    @Test
    public void visitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr expr = mock(DecimalExpr.class);
        when(expr.toString()).thenReturn("5.0");
        String actual = visitor.visit(expr);
        assert actual.equals("x= 5\n");
    }

}