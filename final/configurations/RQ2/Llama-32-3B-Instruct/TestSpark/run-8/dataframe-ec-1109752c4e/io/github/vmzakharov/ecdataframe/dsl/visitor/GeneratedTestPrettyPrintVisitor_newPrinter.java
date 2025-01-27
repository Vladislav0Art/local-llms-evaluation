package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_newPrinter {

    @Test
    public void testPrettyPrintVisitor_newPrinter() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        assertEquals(1, visitor.getCollectedPrinter().getCount());
    }

}