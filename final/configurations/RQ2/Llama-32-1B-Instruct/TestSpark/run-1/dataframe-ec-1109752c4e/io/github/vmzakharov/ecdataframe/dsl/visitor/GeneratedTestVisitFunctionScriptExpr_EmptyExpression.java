package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionScriptExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitFunctionScriptExpr_EmptyExpression() {
        Expression expr = exprToString(FunctionCallExpr.F + "A * B");
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}