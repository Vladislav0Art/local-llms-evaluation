package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Pow {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitBinaryExpr_Pow() {
        Expression expr = exprToString(BinaryExpr.A ^ BinaryExpr.B);
        String output = (String) visitor.visit(expr);
        assertEquals("(A ^ B)", output);
    }

}