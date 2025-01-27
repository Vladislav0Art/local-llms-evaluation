package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitConstExpr_ReturnsValueAsString {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitConstExpr_ReturnsValueAsString() {
        Value expr = new Value(5);
        String result = PrettyPrintVisitor.exprToString(visitor.visitConstExpr(expr));
        assertEquals("5", result);
    }

}