package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprIsVisitedCorrectly {

    @Test
    public void visitFunctionCallExprIsVisitedCorrectly() {
        FunctionCallExpr expr = new FunctionCallExpr("some function", 1, 2);
        io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
        assertEquals("some function(1,2)", io.github.vmzakharov.ecdataframe.util.CollectingPrinter.print());
    }

}