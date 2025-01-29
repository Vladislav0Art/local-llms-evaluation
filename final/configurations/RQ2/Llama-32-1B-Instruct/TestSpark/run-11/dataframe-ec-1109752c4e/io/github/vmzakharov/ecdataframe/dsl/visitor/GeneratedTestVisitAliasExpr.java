package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAliasExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitAliasExpr() {
        Expression expr = new AliasExpr(new VarExpr("x"), "y");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}