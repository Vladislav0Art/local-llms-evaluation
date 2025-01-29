package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitProjectionExpr {

    private Printer printer;

    @Test
    public void visitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr projectionExpr = new ProjectionExpr("y", "x");
        visitor.visitProjectionExpr(projectionExpr);
        assertEquals(72, printer.print(visitedExpressions));
    }

}