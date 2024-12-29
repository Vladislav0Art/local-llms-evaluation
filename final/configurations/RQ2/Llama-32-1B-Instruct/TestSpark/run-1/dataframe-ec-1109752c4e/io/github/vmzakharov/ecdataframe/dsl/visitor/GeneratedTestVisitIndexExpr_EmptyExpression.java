package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIndexExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitIndexExpr_EmptyExpression() {
        Expression expr = exprToString(IndexExpr.I.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}