package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr_PrettyPrinting {

    private PrettyPrintVisitor prettyPrintVisitor;
    private Printer printer;

    @Before
    public void setup() {
        prettyPrintVisitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter();
    }

    @Test
    public void testVisitUnaryExpr_PrettyPrinting() {
        UnaryExpr expr = new UnaryExpr(new ConstExpr(5));
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("5", printedExpression);
    }

}