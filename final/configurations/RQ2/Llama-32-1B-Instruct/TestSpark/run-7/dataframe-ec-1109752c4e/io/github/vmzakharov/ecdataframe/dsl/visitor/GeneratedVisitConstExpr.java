package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitConstExpr {

    private Printer printer;

    @Test
    public void visitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ConstExpr constExpr = new ConstExpr(5);
        visitor.visitConstExpr(constExpr);
        assertEquals(6, printer.print(visitedExpressions));
    }

}