package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr {

    private Printer newPrinter;

    @Test
    public void testVisitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        FunctionCallExpr expr = new FunctionCallExpr("Math.sin", "x");
        visitor.visit(expr);
        verify(newPrinter, times(2)).visit(expr);
    }

}