package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitConstExpr {

    @Test
    public void testPrettyPrintVisitor_visitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        Value value = new Value();
        visitor.visit(value);
        assertEquals(5, visitor.getCollectedPrinter().getCount());
    }

}