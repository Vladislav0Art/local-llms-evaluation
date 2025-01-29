package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr {

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression constExpr = new ConstExpr(new VarExpr("x"), "10");
        String result = visitor.visit(constExpr);
        assertEquals("\"10\"", result);
    }

}