package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expression = mock(AssingExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAssignExpr(expression);
    }

}