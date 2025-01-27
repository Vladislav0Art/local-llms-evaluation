package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitUnaryExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitUnaryExpr_ReturnsCorrectStringFormat() {
        UnaryExpr expr = new UnaryExpr(new VarExpr("b"), "-");
        String result = PrettyPrintVisitor.exprToString(visitor.visitUnaryExpr(expr));
        assertEquals("-b", result);
    }

}