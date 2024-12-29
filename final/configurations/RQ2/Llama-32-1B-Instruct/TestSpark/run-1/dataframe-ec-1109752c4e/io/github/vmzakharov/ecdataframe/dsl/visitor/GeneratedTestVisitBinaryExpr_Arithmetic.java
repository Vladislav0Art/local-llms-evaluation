package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Arithmetic {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitBinaryExpr_Arithmetic() {
        Expression expr = exprToString(BinaryExpr.A + BinaryExpr.B * 2);
        String output = (String) visitor.visit(expr);
        assertEquals("(A + B) * 2", output);
    }

}