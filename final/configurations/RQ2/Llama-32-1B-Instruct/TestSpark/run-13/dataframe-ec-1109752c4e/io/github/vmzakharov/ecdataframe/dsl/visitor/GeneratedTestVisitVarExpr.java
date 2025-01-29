package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr {

    private Printer newPrinter;

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        VarExpr expr = new VarExpr("x");
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}