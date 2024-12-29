package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr_Identity {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitConstExpr_Identity() {
        Expression expr = exprToString(Value.V0);
        String output = (String) visitor.visit(expr);
        assertEquals("Identity[1]", output);
    }

}