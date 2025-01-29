package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAliasExpr {

    private Printer printer;

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr expr = StringIterate.of("x y").exprToString();
        assert visitor.visitAliasExpr(expr) : "Failed to visit AliasExpr";
    }

}