package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr {

    private Printer newPrinter;

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        AnonymousScript expr = new AnonymousScript();
        visitor.visit(expr);
        verify(newPrinter, times(1)).visit(expr);
    }

}