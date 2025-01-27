package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitAnonymousScriptExpr {

    @Test
    public void testPrettyPrintVisitor_visitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        AnonymousScript expr = new AnonymousScript();
        visitor.visit(expr);
        assertEquals(8, visitor.getCollectedPrinter().getCount());
    }

}