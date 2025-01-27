package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPrettyPrintVisitor_visitStatementSequenceScript {

    @Test
    public void testPrettyPrintVisitor_visitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        StatementSequenceScript expr = new StatementSequenceScript();
        visitor.visit(expr);
        assertEquals(10, visitor.getCollectedPrinter().getCount());
    }

}