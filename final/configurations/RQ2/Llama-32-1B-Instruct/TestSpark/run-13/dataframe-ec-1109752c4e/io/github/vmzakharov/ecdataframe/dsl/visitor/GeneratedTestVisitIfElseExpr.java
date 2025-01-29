package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIfElseExpr {

    private Printer newPrinter;

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        IfElseExpr expr = new IfElseExpr();
        visitor.visit(expr);
        verify(newPrinter, times(2)).visit(expr);
    }

}