package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAnonymousScriptExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitAnonymousScriptExpr_EmptyExpression() {
        Expression expr = exprToString(AssingExpr.A == 10, BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}