package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAssignExpr_SimpleAssignment {

    private Printer printer;
    private PrettyPrintVisitor prettyPrintVisitor;

    @Before
    public void setUp() {
        printer = new PrinterFactory().createPrinter();
        prettyPrintVisitor = new PrettyPrintVisitor(printer);
    }

    @Test
    public void testVisitAssignExpr_SimpleAssignment() {
        AssignmentExpr expr = new AssignmentExpr("x", 5, "y");
        prettyPrintVisitor.visit(expr);
        verify(printer).printExpression("assign x=5 y");
    }

}