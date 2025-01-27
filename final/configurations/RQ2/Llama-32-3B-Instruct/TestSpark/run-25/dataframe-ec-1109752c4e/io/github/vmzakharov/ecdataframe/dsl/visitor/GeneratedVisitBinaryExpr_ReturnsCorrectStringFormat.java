package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitBinaryExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitBinaryExpr_ReturnsCorrectStringFormat() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), "+", new Value(5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitBinaryExpr(expr));
        assertEquals("a + 5", result);
    }

}