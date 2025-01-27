package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitVectorExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitVectorExpr_ReturnsCorrectStringFormat() {
        VectorExpr expr = new VectorExpr(new Value(1), new Value(2));
        String result = PrettyPrintVisitor.exprToString(visitor.visitVectorExpr(expr));
        assertEquals("[1, 2]", result);
    }

}