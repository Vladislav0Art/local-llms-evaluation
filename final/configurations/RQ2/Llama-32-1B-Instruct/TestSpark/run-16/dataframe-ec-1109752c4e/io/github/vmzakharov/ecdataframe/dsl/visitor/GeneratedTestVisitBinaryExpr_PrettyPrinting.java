package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_PrettyPrinting {

    private PrettyPrintVisitor prettyPrintVisitor;
    private Printer printer;

    @Before
    public void setup() {
        prettyPrintVisitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter();
    }

    @Test
    public void testVisitBinaryExpr_PrettyPrinting() {
        BinaryExpr expr = new BinaryExpr(new Expression[]{new ConstExpr(10), new AddExpr(2, 3)});
        expressionToTest(expr);
        String printedExpression = prettyPrintVisitor.visit(expr).toString();
        assertEquals("10 + 2 + 3", printedExpression);
    }

}