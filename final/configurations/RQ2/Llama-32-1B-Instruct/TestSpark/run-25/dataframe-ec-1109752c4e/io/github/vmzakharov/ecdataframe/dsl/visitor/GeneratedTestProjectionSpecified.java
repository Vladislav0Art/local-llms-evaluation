package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestProjectionSpecified {

    @Test
    public void testProjectionSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Projection projection = new Projection("x", new Expression[]{new ConstExpr(Value.CLEAR_VALUE)});
        Assert.assertTrue(visitor.visitProjection(projection));
    }

}