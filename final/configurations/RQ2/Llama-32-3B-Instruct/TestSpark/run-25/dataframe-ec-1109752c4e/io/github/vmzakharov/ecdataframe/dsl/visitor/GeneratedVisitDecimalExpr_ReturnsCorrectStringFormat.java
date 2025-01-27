package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitDecimalExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitDecimalExpr_ReturnsCorrectStringFormat() {
        DecimalExpr expr = new DecimalExpr(new Value(5.5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitDecimalExpr(expr));
        assertEquals("5.5", result);
    }

}