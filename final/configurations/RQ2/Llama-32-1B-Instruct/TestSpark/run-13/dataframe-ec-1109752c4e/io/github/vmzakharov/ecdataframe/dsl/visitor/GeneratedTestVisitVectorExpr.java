package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr {

    private Printer newPrinter;

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        VectorExpr expr = new VectorExpr();
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}