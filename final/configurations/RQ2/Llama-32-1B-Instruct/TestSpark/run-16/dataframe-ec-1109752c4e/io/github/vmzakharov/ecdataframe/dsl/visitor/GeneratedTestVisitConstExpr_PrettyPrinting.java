package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr_PrettyPrinting {

    private PrettyPrintVisitor prettyPrintVisitor;
    private Printer printer;

    @Before
    public void setup() {
        prettyPrintVisitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter();
    }

    @Test
    public void testVisitConstExpr_PrettyPrinting() {
        Value expr = new ConstExpr(10);
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("10", printedExpression);
    }

}