package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitFunctionCallExpr() {
        Expression expr = new FunctionCallExpr("x", "y");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}