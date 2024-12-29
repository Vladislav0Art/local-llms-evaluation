package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr_Pow {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitUnaryExpr_Pow() {
        Expression expr = exprToString(UnaryExpr.X ^ 3);
        String output = (String) visitor.visit(expr);
        assertEquals("X ^ 3", output);
    }

}