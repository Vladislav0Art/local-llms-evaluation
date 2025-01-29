package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr {

    private Printer newPrinter;

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        FunctionScript expr = new FunctionScript("x", 5);
        visitor.visit(expr);
        verify(newPrinter, times(2)).visit(expr);
    }

}