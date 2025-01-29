package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_BinaryOperatorMultipleValues {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitBinaryExpr_BinaryOperatorMultipleValues() {
        BinaryExpr expr = new BinaryExpr("*", new Value[]{Value.of(2), Value.of(4)}, "w");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("bin op 2* 4 w");
    }

}