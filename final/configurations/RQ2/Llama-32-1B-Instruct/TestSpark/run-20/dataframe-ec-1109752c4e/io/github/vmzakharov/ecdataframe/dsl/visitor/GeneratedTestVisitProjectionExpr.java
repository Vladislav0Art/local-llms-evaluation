package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr {

    private Printer printer;

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr expr = StringIterate.of("a, b c").exprToString();
        assert visitor.visitProjectionExpr(expr) : "Failed to visit ProjectionExpr";
    }

}