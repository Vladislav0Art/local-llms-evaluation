package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new AnonymousScriptExpr(new VarExpr("x"));
        expr.toString().println(visitor.visit(expr));
    }

}