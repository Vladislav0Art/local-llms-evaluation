package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr {

    @Test
    public void testVisitUnaryExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitUnaryExpr(new UnaryExpr(UnaryExpr.UNARY_NAME, new Expression[]{new VarExpr("x"), new ConstExpr(Value.CLEAR_VALUE)})));
    }

}