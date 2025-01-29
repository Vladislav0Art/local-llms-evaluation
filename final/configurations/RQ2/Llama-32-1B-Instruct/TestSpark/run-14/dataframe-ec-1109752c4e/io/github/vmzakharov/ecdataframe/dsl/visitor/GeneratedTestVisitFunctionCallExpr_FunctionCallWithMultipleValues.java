package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitFunctionCallExpr_FunctionCallWithMultipleValues {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitFunctionCallExpr_FunctionCallWithMultipleValues() {
        FunctionCallExpr expr = new FunctionCallExpr("add", Value.of(new ListIterable[]{Value.of(5), Value.of(3)}));
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("func add (5+ 3)");
    }

}