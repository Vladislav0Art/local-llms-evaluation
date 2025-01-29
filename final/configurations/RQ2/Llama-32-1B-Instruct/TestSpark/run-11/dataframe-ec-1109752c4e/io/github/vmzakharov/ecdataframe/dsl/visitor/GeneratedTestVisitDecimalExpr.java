package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitDecimalExpr() {
        Expression expr = new DecimalExpr("1.0f");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}