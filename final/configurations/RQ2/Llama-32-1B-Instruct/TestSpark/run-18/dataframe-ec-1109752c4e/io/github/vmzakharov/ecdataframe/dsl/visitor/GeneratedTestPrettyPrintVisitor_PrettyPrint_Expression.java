package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrintVisitor_PrettyPrint_Expression {

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_Expression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(Expression.of("a", "b"));
        Assert.assertNotNull(result);
    }

}