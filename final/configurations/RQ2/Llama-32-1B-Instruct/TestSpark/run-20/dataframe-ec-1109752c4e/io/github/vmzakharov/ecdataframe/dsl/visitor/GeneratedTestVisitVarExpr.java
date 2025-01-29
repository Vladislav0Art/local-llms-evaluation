package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr {

    private Printer printer;

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr expr = StringIterate.of("x").exprToString();
        assert visitor.visitVarExpr(expr) : "Failed to visit VarExpr";
    }

}