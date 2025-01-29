package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr_AssignmentWithMultipleValues {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitAssignExpr_AssignmentWithMultipleValues() {
        AssignmentExpr expr = new AssignmentExpr("x", Value.of(10), "y");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("assign x=10 y");
    }

}