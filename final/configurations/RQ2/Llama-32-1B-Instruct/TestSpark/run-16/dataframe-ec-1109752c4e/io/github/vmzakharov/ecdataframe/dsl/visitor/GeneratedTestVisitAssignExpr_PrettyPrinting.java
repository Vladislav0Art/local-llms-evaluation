package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr_PrettyPrinting {

    private PrettyPrintVisitor prettyPrintVisitor;
    private Printer printer;

    @Before
    public void setup() {
        prettyPrintVisitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter();
    }

    @Test
    public void testVisitAssignExpr_PrettyPrinting() {
        String expr = "x = 5";
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("x=5", printedExpression);
    }

}