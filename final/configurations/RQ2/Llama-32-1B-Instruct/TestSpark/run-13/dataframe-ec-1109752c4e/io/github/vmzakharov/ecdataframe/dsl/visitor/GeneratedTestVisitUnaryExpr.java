package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr {

    private Printer newPrinter;

    @Test
    public void testVisitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        UnaryExpr expr = new UnaryExpr("x", 5);
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}