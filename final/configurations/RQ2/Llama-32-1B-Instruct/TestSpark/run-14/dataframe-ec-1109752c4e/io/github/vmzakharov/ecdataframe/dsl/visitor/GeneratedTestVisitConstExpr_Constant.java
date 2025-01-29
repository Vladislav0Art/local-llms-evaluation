package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr_Constant {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitConstExpr_Constant() {
        ConstExpr expr = new ConstExpr(Value.of(10));
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("const 10");
    }

}