package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitVectorExpr {

    private Printer printer;

    @Test
    public void visitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExpr = new VectorExpr(new VarExpr("x"), new ConstExpr(5));
        visitor.visitVectorExpr(vectorExpr);
        assertEquals(90, printer.print(visitedExpressions));
    }

}