package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitProjectionExpr {

    @Test
    public void testPrettyPrintVisitor_visitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        ProjectionExpr expr = new ProjectionExpr();
        visitor.visit(expr);
        assertEquals(12, visitor.getCollectedPrinter().getCount());
    }

}