package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitDecimalExpr_EmptyExpression() {
        Expression expr = exprToString(DecimalExpr.D.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}