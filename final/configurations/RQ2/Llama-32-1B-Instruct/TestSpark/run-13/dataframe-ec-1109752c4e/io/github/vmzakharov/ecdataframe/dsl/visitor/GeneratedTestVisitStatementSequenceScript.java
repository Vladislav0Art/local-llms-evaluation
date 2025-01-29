package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitStatementSequenceScript {

    private Printer newPrinter;

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        StatementSequenceScript expr = new StatementSequenceScript();
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}