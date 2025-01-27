package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitIfElseExpr {

    @Test
    public void testPrettyPrintVisitor_visitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        IfElseExpr expr = new IfElseExpr();
        visitor.visit(expr);
        assertEquals(17, visitor.getCollectedPrinter().getCount());
    }

}