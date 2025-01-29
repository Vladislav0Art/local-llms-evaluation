package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitFunctionScriptExpr() {
        Expression expr = new FunctionScriptExpr("x", "y");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}