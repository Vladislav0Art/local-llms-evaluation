package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitPropertyPathExpr_Property {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitPropertyPathExpr_Property() {
        PropertyPathExpr expr = new PropertyPathExpr("x", "y");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("prop x y");
    }

}