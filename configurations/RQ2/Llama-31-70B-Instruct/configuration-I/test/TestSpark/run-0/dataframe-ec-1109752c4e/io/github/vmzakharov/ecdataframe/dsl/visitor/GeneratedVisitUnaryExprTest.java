package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expression = mock(UnaryExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitUnaryExpr(expression);
    }

}