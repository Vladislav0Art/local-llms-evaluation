package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitAssignExpr() {
        Expression expr = exprToString(AssingExpr.A = 10, B = 5);
        String output = (String) visitor.visit(expr);
        assertEquals("A = 10", output);
    }

}