package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedVisitAliasExpr {

    private Printer printer;

    @Test
    public void visitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr aliasExpr = new AliasExpr("z", 10);
        visitor.visitAliasExpr(aliasExpr);
        assertEquals(84, printer.print(visitedExpressions));
    }

}