package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitAliasExpr {

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression aliasExpr = new AliasExpr(new VarExpr("x"));
        String result = visitor.visit(aliasExpr);
        assertEquals("\"x\"", result);
    }

}