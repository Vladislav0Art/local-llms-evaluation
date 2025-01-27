package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor VisitDecimalExprNoValue {

    @Test
    public void testPrettyPrintVisitor

    VisitDecimalExprNoValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        DecimalExpr expr = new DecimalExpr();
        visitor.visit(expr);
        assertEquals(16, visitor.getCollectedPrinter().getCount());
    }

}