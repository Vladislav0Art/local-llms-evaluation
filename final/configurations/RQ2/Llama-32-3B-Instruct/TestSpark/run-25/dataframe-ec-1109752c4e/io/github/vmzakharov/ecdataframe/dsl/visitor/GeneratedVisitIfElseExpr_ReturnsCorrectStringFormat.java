package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitIfElseExpr_ReturnsCorrectStringFormat {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.createDefaultPrinter();

    @Test
    public void visitIfElseExpr_ReturnsCorrectStringFormat() {
        IfElseExpr expr = new IfElseExpr(new VarExpr("x"), new Value(10), new Value(20));
        String result = PrettyPrintVisitor.exprToString(visitor.visitIfElseExpr(expr));
        assertEquals("if x then 10 else 20", result);
    }

}