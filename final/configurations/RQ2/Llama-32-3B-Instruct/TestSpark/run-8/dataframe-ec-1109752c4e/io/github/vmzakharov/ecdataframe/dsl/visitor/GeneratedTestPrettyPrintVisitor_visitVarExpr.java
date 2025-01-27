package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitVarExpr {

    @Test
    public void testPrettyPrintVisitor_visitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        VarExpr expr = new VarExpr();
        visitor.visit(expr);
        assertEquals(11, visitor.getCollectedPrinter().getCount());
    }

}