package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitPropertyPathExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitPropertyPathExpr_ReturnsCorrectStringFormat() {
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("x"), "y");
        String result = PrettyPrintVisitor.exprToString(visitor.visitPropertyPathExpr(expr));
        assertEquals("x.y", result);
    }

}