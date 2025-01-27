package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitAnonymousScriptExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitAnonymousScriptExpr_ReturnsCorrectStringFormat() {
        AnonymousScript expr = new AnonymousScript("{ print(1) }");
        String result = PrettyPrintVisitor.exprToString(visitor.visitAnonymousScriptExpr(expr));
        assertEquals("print(1)", result);
    }

}