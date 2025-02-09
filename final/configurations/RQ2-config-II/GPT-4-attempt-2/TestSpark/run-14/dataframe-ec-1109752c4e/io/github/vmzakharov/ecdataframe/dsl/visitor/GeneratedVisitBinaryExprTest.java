package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
    }

}