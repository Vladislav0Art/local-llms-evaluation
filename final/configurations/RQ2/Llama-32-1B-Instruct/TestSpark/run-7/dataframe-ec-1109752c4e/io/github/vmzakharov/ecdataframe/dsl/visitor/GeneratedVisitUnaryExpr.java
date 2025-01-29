package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitUnaryExpr {

    private Printer printer;

    @Test
    public void visitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr unaryExpr = new UnaryExpr("x", 10);
        visitor.visitUnaryExpr(unaryExpr);
        assertEquals(20, printer.print(visitedExpressions));
    }

}