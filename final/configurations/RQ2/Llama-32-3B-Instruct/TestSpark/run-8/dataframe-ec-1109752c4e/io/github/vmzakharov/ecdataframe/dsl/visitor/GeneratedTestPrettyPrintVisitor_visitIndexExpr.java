package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitIndexExpr {

    @Test
    public void testPrettyPrintVisitor_visitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        IndexExpr expr = new IndexExpr();
        visitor.visit(expr);
        assertEquals(15, visitor.getCollectedPrinter().getCount());
    }

}