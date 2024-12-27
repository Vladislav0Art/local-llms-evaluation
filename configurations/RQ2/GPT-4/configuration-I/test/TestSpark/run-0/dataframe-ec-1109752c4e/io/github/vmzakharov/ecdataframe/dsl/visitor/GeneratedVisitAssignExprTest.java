package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssignExpr expr = new AssignExpr();
        visitor.visitAssignExpr(expr);
        assertEquals(AssignExpr.class, expr.getClass());
    }

}