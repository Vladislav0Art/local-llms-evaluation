package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitVectorExpr {

    @Test
    public void testPrettyPrintVisitor_visitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        VectorExpr expr = new VectorExpr();
        visitor.visit(expr);
        assertEquals(14, visitor.getCollectedPrinter().getCount());
    }

}