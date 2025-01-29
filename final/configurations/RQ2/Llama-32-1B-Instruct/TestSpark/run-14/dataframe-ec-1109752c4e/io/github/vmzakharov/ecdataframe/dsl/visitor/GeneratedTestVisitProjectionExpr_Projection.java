package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr_Projection {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitProjectionExpr_Projection() {
        ProjectionExpr expr = new ProjectionExpr(new String[]{"z", new ListIterable[]{Value.of(5), Value.of(3)}});
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("proj z (x y)");
    }

}