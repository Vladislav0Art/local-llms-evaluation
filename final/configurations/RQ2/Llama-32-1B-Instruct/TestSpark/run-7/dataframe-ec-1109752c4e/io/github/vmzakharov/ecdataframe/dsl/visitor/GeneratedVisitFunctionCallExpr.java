package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitFunctionCallExpr {

    private Printer printer;

    @Test
    public void visitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("x", 10, "y");
        visitor.visitFunctionCallExpr(functionCallExpr);
        assertEquals(52, printer.print(visitedExpressions));
    }

}