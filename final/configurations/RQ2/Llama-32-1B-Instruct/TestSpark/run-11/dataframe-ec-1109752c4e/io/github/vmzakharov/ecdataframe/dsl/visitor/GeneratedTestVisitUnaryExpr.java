package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitUnaryExpr() {
        Expression expr = new UnaryExpr("x");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}