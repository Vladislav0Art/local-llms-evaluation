package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr {

    private Printer newPrinter;

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        DecimalExpr expr = new DecimalExpr();
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}