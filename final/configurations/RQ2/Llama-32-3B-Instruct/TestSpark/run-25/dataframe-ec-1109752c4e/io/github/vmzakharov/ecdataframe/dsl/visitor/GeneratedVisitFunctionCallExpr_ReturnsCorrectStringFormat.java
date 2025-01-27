package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitFunctionCallExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitFunctionCallExpr_ReturnsCorrectStringFormat() {
        FunctionCallExpr expr = new FunctionCallExpr(new VarExpr("func"), new Value(10), new ArrayExpr(new Value(1), new Value(2)));
        String result = PrettyPrintVisitor.exprToString(visitor.visitFunctionCallExpr(expr));
        assertEquals("func([1, 2])", result);
    }

}