package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestIfElseSpecified {

    @Test
    public void testIfElseSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        IfElse ifElse = new IfElse("if", ListIterable.of(new Expression[]{new ConstExpr(Value.CLEAR_VALUE), new ConstExpr(Value.NAME)});
        Assert.assertTrue(visitor.visitIfElse(ifElse));
    }

}