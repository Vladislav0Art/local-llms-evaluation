package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitIndexExpr {

    private Printer printer;

    @Test
    public void visitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr indexExpr = new IndexExpr(new VarExpr("x"), 2);
        visitor.visitIndexExpr(indexExpr);
        assertEquals(92, printer.print(visitedExpressions));
    }

}