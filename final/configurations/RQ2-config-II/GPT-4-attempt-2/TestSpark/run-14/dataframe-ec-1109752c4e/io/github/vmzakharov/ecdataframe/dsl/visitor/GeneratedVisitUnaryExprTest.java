package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);
    }

}