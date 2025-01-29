package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitAnonymousScriptExpr() {
        Expression expr = new AnonymousScriptExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}