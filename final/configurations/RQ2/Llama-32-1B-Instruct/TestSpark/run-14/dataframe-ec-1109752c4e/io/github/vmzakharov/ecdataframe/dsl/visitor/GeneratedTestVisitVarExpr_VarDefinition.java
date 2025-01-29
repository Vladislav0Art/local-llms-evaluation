package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr_VarDefinition {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitVarExpr_VarDefinition() {
        VarExpr expr = new VarExpr("x", "y");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("var x y");
    }

}