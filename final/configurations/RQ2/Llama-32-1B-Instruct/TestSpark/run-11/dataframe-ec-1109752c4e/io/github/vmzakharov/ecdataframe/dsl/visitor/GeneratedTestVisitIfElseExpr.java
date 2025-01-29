package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIfElseExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitIfElseExpr() {
        Expression expr = new IfElseExpr(2, 1, 3);
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}