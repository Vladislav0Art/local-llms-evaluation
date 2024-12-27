package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr expr = new FunctionCallExpr();
        visitor.visitFunctionCallExpr(expr);
        assertEquals(FunctionCallExpr.class, expr.getClass());
    }

}