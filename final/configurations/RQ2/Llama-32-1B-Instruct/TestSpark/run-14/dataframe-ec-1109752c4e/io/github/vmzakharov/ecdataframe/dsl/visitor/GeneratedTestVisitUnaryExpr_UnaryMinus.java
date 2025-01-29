package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr_UnaryMinus {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitUnaryExpr_UnaryMinus() {
        UnaryExpr expr = new UnaryExpr("-", new Value[]{Value.of(5)});
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("un bin -5");
    }

}