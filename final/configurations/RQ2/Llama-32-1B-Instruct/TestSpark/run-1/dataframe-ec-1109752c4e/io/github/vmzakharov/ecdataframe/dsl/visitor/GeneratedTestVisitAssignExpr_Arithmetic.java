package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr_Arithmetic {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitAssignExpr_Arithmetic() {
        Expression expr = exprToString(AssingExpr.A + BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("A = A + B * 2", output);
    }

}