package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitAssignExpr {

    @Test
    public void testPrettyPrintVisitor_visitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        AssingExpr expr = new AssingExpr();
        visitor.visit(expr);
        assertEquals(2, visitor.getCollectedPrinter().getCount());
    }

}