package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitIfElseExpr {

    private Printer printer;

    @Test
    public void visitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr ifElseExpr = new IfElseExpr("x > 5", "y = 10");
        visitor.visitIfElseExpr(ifElseExpr);
        assertEquals(124, printer.print(visitedExpressions));
    }

}