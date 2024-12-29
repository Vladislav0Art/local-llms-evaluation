package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitProjectionExpr_EmptyExpression() {
        Expression expr = exprToString(ProjectionExpr.O.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}