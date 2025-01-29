package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr {

    private Printer newPrinter;

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        ProjectionExpr expr = new ProjectionExpr();
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}