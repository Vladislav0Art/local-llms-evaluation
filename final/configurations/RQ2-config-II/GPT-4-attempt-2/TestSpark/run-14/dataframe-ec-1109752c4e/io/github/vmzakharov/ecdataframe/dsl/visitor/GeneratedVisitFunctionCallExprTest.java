package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = Mockito.mock(FunctionCallExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
    }

}