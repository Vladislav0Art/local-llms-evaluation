package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrintVisitor {

    @Test
    public void testPrettyPrintVisitor() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assert.assertTrue(visitor.canVisit(AssingExpr.class));
        Assert.assertTrue(visitor.canVisit(AnonymousScriptExpr.class));
        Assert.assertTrue(visitor.canVisit(FunctionCallExpr.class));
        Assert.assertFalse(visitor.canVisit(PropertyPathExpr.class));
        Assert.assertFalse(visitor.canVisit(IndexExpr.class));
        Assert.assertFalse(visitor.canVisit(DictionaryExpr.class));
    }

}