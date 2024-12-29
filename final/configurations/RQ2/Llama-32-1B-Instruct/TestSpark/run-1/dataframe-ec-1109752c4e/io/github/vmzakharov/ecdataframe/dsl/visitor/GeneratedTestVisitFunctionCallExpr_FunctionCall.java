package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr_FunctionCall {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitFunctionCallExpr_FunctionCall() {
        Expression expr = exprToString(FunctionCallExpr.F + "A * B");
        String output = (String) visitor.visit(expr);
        assertEquals("(F + A) * B", output);
    }

}