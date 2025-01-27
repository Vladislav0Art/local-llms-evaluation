package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitAliasExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitAliasExpr_ReturnsCorrectStringFormat() {
        AliasExpr expr = new AliasExpr(new VarExpr("x"), "y");
        String result = PrettyPrintVisitor.exprToString(visitor.visitAliasExpr(expr));
        assertEquals("y(x)", result);
    }

}