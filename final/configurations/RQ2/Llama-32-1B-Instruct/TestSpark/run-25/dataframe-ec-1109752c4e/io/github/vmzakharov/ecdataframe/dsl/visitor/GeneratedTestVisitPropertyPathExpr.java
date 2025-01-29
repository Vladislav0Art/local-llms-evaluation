package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr {

    @Test
    public void testVisitPropertyPathExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitPropertyPathExpr(new PropertyPathExpr(PropertyPathExpr.PROPERTY_NAME, new Expression[]{new VarExpr("x"), new ConstExpr(Value.CLEAR_VALUE)})));
    }

}