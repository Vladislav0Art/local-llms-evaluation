package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr {

    @Test
    public void testVisitAnonymousScriptExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitAnonymousScriptExpr(new AnonymousScriptExpr(AssingExpr.ASS_NAME, "x", "y")));
    }

}