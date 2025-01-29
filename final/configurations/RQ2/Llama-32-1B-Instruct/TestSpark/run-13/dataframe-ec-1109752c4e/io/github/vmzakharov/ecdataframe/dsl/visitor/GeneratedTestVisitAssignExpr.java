package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    private Printer newPrinter;

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        AssignExpr expr = new AssignExpr("x", 5);
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}