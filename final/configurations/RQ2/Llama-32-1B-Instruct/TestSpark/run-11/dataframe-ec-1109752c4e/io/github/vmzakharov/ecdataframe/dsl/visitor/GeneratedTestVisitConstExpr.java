package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitConstExpr() {
        Expression expr = new ConstExpr(new Value(1.0f));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}