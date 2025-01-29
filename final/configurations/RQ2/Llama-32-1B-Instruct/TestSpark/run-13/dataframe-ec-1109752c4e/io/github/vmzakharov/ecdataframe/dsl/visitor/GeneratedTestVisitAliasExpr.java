package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAliasExpr {

    private Printer newPrinter;

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        AliasExpr expr = new AliasExpr("x");
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}