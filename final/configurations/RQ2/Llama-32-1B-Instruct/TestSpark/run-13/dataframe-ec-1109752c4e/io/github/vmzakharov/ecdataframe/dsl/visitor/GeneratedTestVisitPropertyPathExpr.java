package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr {

    private Printer newPrinter;

    @Test
    public void testVisitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        PropertyPathExpr expr = new PropertyPathExpr("y", "x");
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}