package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr {

    private Printer printer;

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = StringIterate.of("a").exprToString();
        assert visitor.visitBinaryExpr(expr) : "Failed to visit BinaryExpr";
    }

}