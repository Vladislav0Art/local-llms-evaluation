package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVectorSpecified {

    @Test
    public void testVectorSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Vector vector = new Vector(new Expression[]{new ConstExpr(Value.CLEAR_VALUE)});
        Assert.assertTrue(visitor.visitVector(vector));
    }

}