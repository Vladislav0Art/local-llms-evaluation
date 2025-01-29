package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_BinaryOperator {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitBinaryExpr_BinaryOperator() {
        BinaryExpr expr = new BinaryExpr("+", new Value[]{Value.of(5), Value.of(3)}, "z");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("bin op 5+ 3 z");
    }

}