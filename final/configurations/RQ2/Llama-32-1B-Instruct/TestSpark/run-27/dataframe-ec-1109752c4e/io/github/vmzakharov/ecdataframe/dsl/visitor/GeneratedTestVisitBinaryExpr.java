package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr {

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression binaryExpr = new BinaryExpr(new VarExpr("x"), "add", new VarExpr("y"));
        String result = visitor.visit(binaryExpr);
        assertEquals("\"1.0\"", result);
    }

}