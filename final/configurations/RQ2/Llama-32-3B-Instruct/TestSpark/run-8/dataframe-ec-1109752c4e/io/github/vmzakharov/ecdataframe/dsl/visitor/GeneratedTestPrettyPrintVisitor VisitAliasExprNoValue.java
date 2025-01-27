package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor VisitAliasExprNoValue {

    @Test
    public void testPrettyPrintVisitor

    VisitAliasExprNoValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        AliasExpr expr = new AliasExpr();
        visitor.visit(expr);
        assertEquals(13, visitor.getCollectedPrinter().getCount());
    }

}