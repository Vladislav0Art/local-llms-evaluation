package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor VisitPropertyPathExprNoValue {

    @Test
    public void testPrettyPrintVisitor

    VisitPropertyPathExprNoValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        PropertyPathExpr expr = new PropertyPathExpr();
        visitor.visit(expr);
        assertEquals(7, visitor.getCollectedPrinter().getCount());
    }

}