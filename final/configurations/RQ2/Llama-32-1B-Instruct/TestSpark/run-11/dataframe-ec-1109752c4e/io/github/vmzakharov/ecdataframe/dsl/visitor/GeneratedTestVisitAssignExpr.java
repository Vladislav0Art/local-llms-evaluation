package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitAssignExpr() {
        Expression expr = new AnonymousScriptExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}