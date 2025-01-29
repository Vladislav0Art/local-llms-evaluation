package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIndexExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitIndexExpr() {
        Expression expr = new IndexExpr(2, "x");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}