package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVarExpr {

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression varExpr = new VarExpr(new VarExpr("x"));
        String result = visitor.visit(varExpr);
        assertEquals("\"x\"", result);
    }

}