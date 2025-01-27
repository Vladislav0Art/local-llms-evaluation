package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitFunctionScriptExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitFunctionScriptExpr_ReturnsCorrectStringFormat() {
        FunctionScript expr = new FunctionScript(new VarExpr("func"), "{ return 10 }");
        String result = PrettyPrintVisitor.exprToString(visitor.visitFunctionScriptExpr(expr));
        assertEquals("func() { return 10 }", result);
    }

}