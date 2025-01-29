package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIndexExpr {

    private Printer newPrinter;

    @Test
    public void testVisitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        IndexExpr expr = new IndexExpr("x", 5);
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}