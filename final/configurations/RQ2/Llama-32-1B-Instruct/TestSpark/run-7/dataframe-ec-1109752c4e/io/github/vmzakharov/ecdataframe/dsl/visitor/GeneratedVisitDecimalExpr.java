package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitDecimalExpr {

    private Printer printer;

    @Test
    public void visitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr decimalExpr = new DecimalExpr(10.5);
        visitor.visitDecimalExpr(decimalExpr);
        assertEquals(102, printer.print(visitedExpressions));
    }

}