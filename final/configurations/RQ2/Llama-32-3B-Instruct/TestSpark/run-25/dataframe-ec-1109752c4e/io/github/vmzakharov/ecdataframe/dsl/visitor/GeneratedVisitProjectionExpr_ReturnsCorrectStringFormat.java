package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitProjectionExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitProjectionExpr_ReturnsCorrectStringFormat() {
        ProjectionExpr expr = new ProjectionExpr(new VarExpr("x"), "y");
        String result = PrettyPrintVisitor.exprToString(visitor.visitProjectionExpr(expr));
        assertEquals("[x.y]", result);
    }

}