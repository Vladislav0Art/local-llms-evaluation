package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitIndexExpr {

    @Test
    public void testVisitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression indexExpr = new IndexExpr(
                new VarExpr("x"),
                "subtract",
                new VarExpr("y")
        );
        String result = visitor.visit(indexExpr);
        assertEquals("\"1.0\"$", result);
    }

}