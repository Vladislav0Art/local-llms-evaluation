package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIndexExpr_IndexAccess {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitIndexExpr_IndexAccess() {
        IndexExpr expr = new IndexExpr("x", "1");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("idx x 1");
    }

}