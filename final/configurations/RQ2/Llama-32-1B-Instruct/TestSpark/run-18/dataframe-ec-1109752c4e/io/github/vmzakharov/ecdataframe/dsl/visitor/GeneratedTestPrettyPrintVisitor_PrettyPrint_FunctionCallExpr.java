package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestPrettyPrintVisitor_PrettyPrint_FunctionCallExpr {

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