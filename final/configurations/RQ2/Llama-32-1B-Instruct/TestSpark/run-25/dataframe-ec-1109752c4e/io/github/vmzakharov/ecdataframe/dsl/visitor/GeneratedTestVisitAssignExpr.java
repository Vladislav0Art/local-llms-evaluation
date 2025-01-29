package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitAssignExpr(new AnonymousScriptExpr(AssingExpr.ASS_NAME, "x", "y")));
    }

}