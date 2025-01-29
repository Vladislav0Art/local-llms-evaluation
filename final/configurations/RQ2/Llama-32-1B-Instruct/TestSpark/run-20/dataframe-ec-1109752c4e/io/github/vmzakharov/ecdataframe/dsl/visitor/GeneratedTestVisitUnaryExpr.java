package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr {

    private Printer printer;

    @Test
    public void testVisitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = StringIterate.of("+").exprToString();
        assert visitor.visitUnaryExpr(expr) : "Failed to visit UnaryExpr";
    }

}