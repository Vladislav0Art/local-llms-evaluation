package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitBinaryExpr {

    private Printer printer;

    @Test
    public void visitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr binaryExpr = new BinaryExpr("x", 10, "y");
        visitor.visitBinaryExpr(binaryExpr);
        assertEquals(32, printer.print(visitedExpressions));
    }

}