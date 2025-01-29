package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIfElseExpr {

    private Printer printer;

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr expr = StringIterate.of("a > b ? x : y").exprToString();
        assert visitor.visitIfElseExpr(expr) : "Failed to visit IfElseExpr";
    }

}