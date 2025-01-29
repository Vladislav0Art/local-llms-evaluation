package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitVarExpr() {
        Expression expr = new VarExpr("x");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}