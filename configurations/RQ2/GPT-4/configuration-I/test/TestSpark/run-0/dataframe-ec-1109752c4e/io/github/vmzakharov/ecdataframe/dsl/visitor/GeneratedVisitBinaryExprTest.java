package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr expr = new BinaryExpr();
        visitor.visitBinaryExpr(expr);
        assertEquals(BinaryExpr.class, expr.getClass());
    }

}