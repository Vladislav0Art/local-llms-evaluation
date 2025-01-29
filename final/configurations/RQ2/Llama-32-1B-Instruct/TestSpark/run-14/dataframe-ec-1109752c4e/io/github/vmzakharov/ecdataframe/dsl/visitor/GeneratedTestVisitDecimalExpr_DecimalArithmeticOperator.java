package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr_DecimalArithmeticOperator {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitDecimalExpr_DecimalArithmeticOperator() {
        DecimalExpr expr = new DecimalExpr("+", Value.of(2), "3");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("dec + 2*3");
    }

}