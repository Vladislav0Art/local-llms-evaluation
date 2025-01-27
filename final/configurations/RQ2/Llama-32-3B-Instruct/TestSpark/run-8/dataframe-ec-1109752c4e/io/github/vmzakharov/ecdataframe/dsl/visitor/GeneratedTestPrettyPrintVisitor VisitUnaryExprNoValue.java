package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor VisitUnaryExprNoValue {

    @Test
    public void testPrettyPrintVisitor

    VisitUnaryExprNoValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        UnaryExpr expr = new UnaryExpr();
        visitor.visit(expr);
        assertEquals(4, visitor.getCollectedPrinter().getCount());
    }

}