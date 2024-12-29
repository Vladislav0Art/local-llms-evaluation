package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr_ObjectCreation {

    private PrettyPrintVisitor visitor;
    private Printer printer;

    @Before
    public void setup() {
        visitor = new PrettyPrintVisitor();
        printer = new CollectingPrinter(new PrinterFactory());
    }

    @Test
    public void testVisitPropertyPathExpr_ObjectCreation() {
        Expression expr = exprToString(PropertyPathExpr.O.get());
        String output = (String) visitor.visit(expr);
        assertEquals("Object", output);
    }

}