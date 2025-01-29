package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitPropertyPathExpr {

    private Printer printer;

    @Test
    public void visitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("x", "y");
        visitor.visitPropertyPathExpr(propertyPathExpr);
        assertEquals(52, printer.print(visitedExpressions));
    }

}