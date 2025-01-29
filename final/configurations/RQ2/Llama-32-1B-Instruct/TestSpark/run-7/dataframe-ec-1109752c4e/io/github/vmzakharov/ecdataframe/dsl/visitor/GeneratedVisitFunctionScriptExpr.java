package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitFunctionScriptExpr {

    private Printer printer;

    @Test
    public void visitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScript = new FunctionScript("x", 10);
        visitor.visitFunctionScriptExpr(functionScript);
        assertEquals(64, printer.print(visitedExpressions));
    }

}