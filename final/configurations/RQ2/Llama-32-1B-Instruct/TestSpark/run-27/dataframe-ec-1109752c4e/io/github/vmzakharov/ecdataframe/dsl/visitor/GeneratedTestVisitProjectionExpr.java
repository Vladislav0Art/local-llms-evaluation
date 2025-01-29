package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr {

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr projectionExpr = new ProjectionExpr(
                new VarExpr("x"),
                new VarExpr("y")
        );
        String result = visitor.visit(projectionExpr);
        assertEquals("\"x,y\"", result);
    }

}