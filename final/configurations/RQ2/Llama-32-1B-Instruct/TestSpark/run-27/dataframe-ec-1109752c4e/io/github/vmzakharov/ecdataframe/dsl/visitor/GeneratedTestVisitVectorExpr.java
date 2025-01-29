package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitVectorExpr {

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExpr = new VectorExpr(
                new VarExpr("x"),
                new VarExpr("y")
        );
        String result = visitor.visit(vectorExpr);
        assertEquals("\"[1.0, 2.0]", result);
    }

}