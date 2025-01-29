package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrintVisitor_PrettyPrint_AssignedExpression {

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_AssignedExpression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(AssignExpr.of("a", 2));
        Assert.assertNotNull(result);
    }

}