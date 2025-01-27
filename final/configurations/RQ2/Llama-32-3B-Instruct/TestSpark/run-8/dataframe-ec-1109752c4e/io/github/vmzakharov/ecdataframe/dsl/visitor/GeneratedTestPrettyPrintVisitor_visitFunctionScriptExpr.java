package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitFunctionScriptExpr {

    @Test
    public void testPrettyPrintVisitor_visitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        FunctionScript expr = new FunctionScript();
        visitor.visit(expr);
        assertEquals(9, visitor.getCollectedPrinter().getCount());
    }

}