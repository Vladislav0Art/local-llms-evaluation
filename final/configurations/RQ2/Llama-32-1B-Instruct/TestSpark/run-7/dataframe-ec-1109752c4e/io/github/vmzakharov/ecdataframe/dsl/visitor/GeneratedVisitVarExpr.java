package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitVarExpr {

    private Printer printer;

    @Test
    public void visitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr varExpr = new VarExpr("x");
        visitor.visitVarExpr(varExpr);
        assertEquals(8, printer.print(visitedExpressions));
    }

}