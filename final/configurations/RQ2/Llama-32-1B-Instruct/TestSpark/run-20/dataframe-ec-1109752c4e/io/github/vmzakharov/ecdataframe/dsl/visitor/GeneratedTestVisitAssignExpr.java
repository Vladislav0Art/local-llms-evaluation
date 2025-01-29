package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    private Printer printer;

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = StringIterate.of("x").exprToString();
        assert visitor.visitAssignExpr(expr) : "Failed to visit AssignExpr";
    }

}