package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIfElseExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitIfElseExpr_EmptyExpression() {
        Expression expr = exprToString(IfElseExpr.I.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}