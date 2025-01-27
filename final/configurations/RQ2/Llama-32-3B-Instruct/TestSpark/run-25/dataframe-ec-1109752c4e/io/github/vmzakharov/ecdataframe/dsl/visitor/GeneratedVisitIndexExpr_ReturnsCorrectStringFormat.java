package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitIndexExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitIndexExpr_ReturnsCorrectStringFormat() {
        IndexExpr expr = new IndexExpr(new VarExpr("x"), new Value(5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitIndexExpr(expr));
        assertEquals("x[5]", result);
    }

}