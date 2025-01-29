package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitStatementSequenceScript {

    private Printer printer;

    @Test
    public void visitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript("if (x > 5) {y = 10;}");
        visitor.visitStatementSequenceScript(statementSequenceScript);
        assertEquals(76, printer.print(visitedExpressions));
    }

}