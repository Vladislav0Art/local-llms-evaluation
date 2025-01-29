package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    private PrettyPrintVisitor visitor;

    @Test
    public void testVisitAssignExpr() {
        Expression expr = new AnonymousScriptExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitBinaryExpr() {
        Expression expr = new BinaryExpr(new IfElseExpr(2, 1, 3));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitUnaryExpr() {
        Expression expr = new UnaryExpr("x");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitConstExpr() {
        Expression expr = new ConstExpr(new Value(1.0f));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitFunctionCallExpr() {
        Expression expr = new FunctionCallExpr("x", "y");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitPropertyPathExpr() {
        Expression expr = new PropertyPathExpr("a.b.c");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitAnonymousScriptExpr() {
        Expression expr = new AnonymousScriptExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitFunctionScriptExpr() {
        Expression expr = new FunctionScriptExpr("x", "y");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitStatementSequenceScript() {
        Expression expr = new StatementSequenceScript(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitVarExpr() {
        Expression expr = new VarExpr("x");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitProjectionExpr() {
        Expression expr = new ProjectionExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitAliasExpr() {
        Expression expr = new AliasExpr(new VarExpr("x"), "y");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitVectorExpr() {
        Expression expr = new VectorExpr(new VarExpr("x"));
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitIndexExpr() {
        Expression expr = new IndexExpr(2, "x");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitDecimalExpr() {
        Expression expr = new DecimalExpr("1.0f");
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

    @Test
    public void testVisitIfElseExpr() {
        Expression expr = new IfElseExpr(2, 1, 3);
        Assert.assertThrows(UnaryExpr.class, () -> visitor.visit(expr));
        Assert.assertTrue(visitor.visit(expr).equals(expr));
    }

}