package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrintVisitor_PrettyPrint_ConstExpr {

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_ConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(Value.of(1));
        Assert.assertNotNull(result);
    }

}