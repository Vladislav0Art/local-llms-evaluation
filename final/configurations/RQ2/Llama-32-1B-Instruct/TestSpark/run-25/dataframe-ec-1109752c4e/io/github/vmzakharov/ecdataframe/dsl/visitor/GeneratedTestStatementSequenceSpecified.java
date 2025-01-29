package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestStatementSequenceSpecified {

    @Test
    public void testStatementSequenceSpecified() {
        StringPrinter printer = new StringPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        StatementSequence sequence = new StatementSequence(new Expression[]{new ConstExpr(Value.CLEAR_VALUE)});
        Assert.assertTrue(visitor.visitStatementSequence(sequence));
    }

}