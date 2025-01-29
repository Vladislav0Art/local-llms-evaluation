package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    @Test
    public void testPrettyPrintVisitor() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assert.assertTrue(visitor.canVisit(AssingExpr.class));
        Assert.assertTrue(visitor.canVisit(AnonymousScriptExpr.class));
        Assert.assertTrue(visitor.canVisit(FunctionCallExpr.class));
        Assert.assertFalse(visitor.canVisit(PropertyPathExpr.class));
        Assert.assertFalse(visitor.canVisit(IndexExpr.class));
        Assert.assertFalse(visitor.canVisit(DictionaryExpr.class));
    }

    @Test
    public void testPrettyPrintVisitor_PrettyPrint() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(AssingExpr.of(1, 2));
        Assert.assertNotNull(result);
    }

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_Expression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(Expression.of("a", "b"));
        Assert.assertNotNull(result);
    }

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_ConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(Value.of(1));
        Assert.assertNotNull(result);
    }

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_AssignedExpression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(AssignExpr.of("a", 2));
        Assert.assertNotNull(result);
    }

    @Test
    public void testPrettyPrintVisitor_PrettyPrint_FunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintResult result = visitor.visit(FunctionCallExpr.of("sum", Arrays.asList(1, 2)));
        Assert.assertNotNull(result);
    }
}

class PrettyPrintResult {
    private String expression;
    private int value;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}