package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr {

    private Printer printer;

    @Test
    public void testVisitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr expr = StringIterate.of("a.b").exprToString();
        assert visitor.visitPropertyPathExpr(expr) : "Failed to visit PropertyPathExpr";
    }

}