package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitPropertyPathExpr() {
        Expression expr = new PropertyPathExpr("a.b.c");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}