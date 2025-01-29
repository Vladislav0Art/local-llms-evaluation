package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr {

    private Printer printer;

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr expr = StringIterate.of("x, y z").exprToString();
        assert visitor.visitVectorExpr(expr) : "Failed to visit VectorExpr";
    }

}