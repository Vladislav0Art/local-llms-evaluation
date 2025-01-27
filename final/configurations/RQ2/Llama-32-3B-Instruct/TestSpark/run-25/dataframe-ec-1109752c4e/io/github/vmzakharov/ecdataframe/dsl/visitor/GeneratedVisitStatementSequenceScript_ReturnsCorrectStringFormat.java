package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitStatementSequenceScript_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitStatementSequenceScript_ReturnsCorrectStringFormat() {
        StatementSequenceScript expr = new StatementSequenceScript("{ print(1) ; print(2) }");
        String result = PrettyPrintVisitor.exprToString(visitor.visitStatementSequenceScript(expr));
        assertEquals("print(1); print(2)", result);
    }

}