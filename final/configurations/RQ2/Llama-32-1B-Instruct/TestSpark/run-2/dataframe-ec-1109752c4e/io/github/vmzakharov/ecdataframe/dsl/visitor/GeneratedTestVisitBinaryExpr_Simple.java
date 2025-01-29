package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Simple {

    @Test
    public void testVisitBinaryExpr_Simple() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L));
        String result = visitor.visit(expr);
        assertEquals("3.0", result);
    }

}