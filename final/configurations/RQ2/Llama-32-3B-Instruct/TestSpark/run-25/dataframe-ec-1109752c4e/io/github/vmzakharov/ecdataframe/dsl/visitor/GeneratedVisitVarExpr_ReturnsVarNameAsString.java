package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitVarExpr_ReturnsVarNameAsString {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitVarExpr_ReturnsVarNameAsString() {
        VarExpr expr = new VarExpr("x");
        String result = PrettyPrintVisitor.exprToString(visitor.visitVarExpr(expr));
        assertEquals("x", result);
    }

}