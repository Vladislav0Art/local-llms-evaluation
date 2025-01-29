package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIndexExpr {

    private Printer printer;

    @Test
    public void testVisitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr expr = StringIterate.of("a, b c d").exprToString();
        assert visitor.visitIndexExpr(expr) : "Failed to visit IndexExpr";
    }

}