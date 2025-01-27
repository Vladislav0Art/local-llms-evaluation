package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitBinaryExpr {

    @Test
    public void testPrettyPrintVisitor_visitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        BinaryExpr expr = new BinaryExpr();
        visitor.visit(expr);
        assertEquals(3, visitor.getCollectedPrinter().getCount());
    }

}