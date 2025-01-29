package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr {

    @Test
    public void testVisitFunctionCallExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitFunctionCallExpr(new FunctionCallExpr(FunctionCallExpr.FUNCTION_NAME, new Expression[]{new AliasExpr(AssingExpr.ASS_NAME, "a")})));
    }

}