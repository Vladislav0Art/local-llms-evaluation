package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrintVisitor_PrettyPrint {

    @Test
    public void testPrettyPrintVisitor_PrettyPrint() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(AssingExpr.of(1, 2));
        Assert.assertNotNull(result);
    }

}