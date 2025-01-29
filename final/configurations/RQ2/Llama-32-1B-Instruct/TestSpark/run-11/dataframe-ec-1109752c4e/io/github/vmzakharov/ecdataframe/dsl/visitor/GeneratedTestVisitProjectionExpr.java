package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitProjectionExpr() {
        Expression expr = new ProjectionExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}