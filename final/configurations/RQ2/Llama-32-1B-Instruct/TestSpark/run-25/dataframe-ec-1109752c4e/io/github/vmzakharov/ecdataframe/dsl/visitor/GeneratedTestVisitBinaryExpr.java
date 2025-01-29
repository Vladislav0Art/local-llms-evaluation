package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr {

    @Test
    public void testVisitBinaryExpr() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Assert.assertTrue(visitor.visitBinaryExpr(new BinaryExpr(BinaryExpr.BINARY_NAME, new Expression[]{new VarExpr("a"), new UnaryExpr(UnaryExpr.UNIT_NAME, new Value(1))})));
    }

}