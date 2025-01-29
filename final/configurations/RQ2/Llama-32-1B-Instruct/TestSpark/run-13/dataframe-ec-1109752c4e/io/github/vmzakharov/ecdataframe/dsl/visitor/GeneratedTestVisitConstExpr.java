package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr {

    private Printer newPrinter;

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        ConstExpr expr = new ConstExpr("x");
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}