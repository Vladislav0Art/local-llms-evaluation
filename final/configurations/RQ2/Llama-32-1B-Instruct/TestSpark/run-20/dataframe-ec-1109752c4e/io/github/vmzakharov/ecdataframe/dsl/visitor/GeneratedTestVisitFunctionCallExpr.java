package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr {

    private Printer printer;

    @Test
    public void testVisitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr expr = StringIterate.of("fn").exprToString();
        assert visitor.visitFunctionCallExpr(expr) : "Failed to visit FunctionCallExpr";
    }

}