package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitFunctionCallExpr_FunctionCall {

    @Test
    public void testVisitFunctionCallExpr_FunctionCall() {
        FunctionCallExpr expr = new FunctionCallExpr("func", Mockito.mock(Value.class));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
    }

}