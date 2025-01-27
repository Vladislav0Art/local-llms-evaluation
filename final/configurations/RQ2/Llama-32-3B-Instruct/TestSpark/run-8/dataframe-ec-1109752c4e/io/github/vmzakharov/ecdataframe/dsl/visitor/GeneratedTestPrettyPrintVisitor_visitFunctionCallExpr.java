package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitFunctionCallExpr {

    @Test
    public void testPrettyPrintVisitor_visitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        FunctionCallExpr expr = new FunctionCallExpr();
        visitor.visit(expr);
        assertEquals(6, visitor.getCollectedPrinter().getCount());
    }

}