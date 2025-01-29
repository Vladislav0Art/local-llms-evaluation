package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr {

    private Printer newPrinter;

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        BinaryExpr expr = new BinaryExpr("x", "y", 3);
        visitor.visit(expr);
        verify(newPrinter, times(2)).visit(expr);
    }

}