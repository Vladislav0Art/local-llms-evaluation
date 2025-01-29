package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr_VectorSum {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitVectorExpr_VectorSum() {
        VectorExpr expr = new VectorExpr(new ListIterable[]{Value.of(5), Value.of(3)});
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("vec sum (5+ 3)");
    }

}