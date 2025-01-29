package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitBinaryExpr() {
        Expression expr = new BinaryExpr(new IfElseExpr(2, 1, 3));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}