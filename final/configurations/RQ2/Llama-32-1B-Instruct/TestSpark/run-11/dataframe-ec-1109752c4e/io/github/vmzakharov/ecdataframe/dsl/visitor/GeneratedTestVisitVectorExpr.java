package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitVectorExpr() {
        Expression expr = new VectorExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}