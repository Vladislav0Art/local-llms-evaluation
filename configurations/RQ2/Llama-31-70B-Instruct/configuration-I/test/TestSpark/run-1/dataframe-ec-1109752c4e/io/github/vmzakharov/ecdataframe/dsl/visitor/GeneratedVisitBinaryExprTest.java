package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expression = mock(BinaryExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitBinaryExpr(expression);
    }

}