package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr_EmptyExpression {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitVectorExpr_EmptyExpression() {
        Expression expr = exprToString(VectorExpr.V.get());
        String output = (String) visitor.visit(expr);
        assertEquals("", output);
    }

}