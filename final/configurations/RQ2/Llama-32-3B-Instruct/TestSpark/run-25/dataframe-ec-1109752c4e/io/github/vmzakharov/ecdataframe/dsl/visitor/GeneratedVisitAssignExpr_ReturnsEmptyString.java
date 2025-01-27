package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitAssignExpr_ReturnsEmptyString {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitAssignExpr_ReturnsEmptyString() {
        AssignmentExpr expr = new AssigningExpr(new VarExpr("x"), new Value(5));
        String result = PrettyPrintVisitor.exprToString(visitor.visitAssignExpr(expr));
        assertEquals("", result);
    }

}