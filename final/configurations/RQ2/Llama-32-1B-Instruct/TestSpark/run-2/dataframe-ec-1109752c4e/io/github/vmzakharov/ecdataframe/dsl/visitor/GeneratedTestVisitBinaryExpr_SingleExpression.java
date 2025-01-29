package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_SingleExpression {

    @Test
    public void testVisitBinaryExpr_SingleExpression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(5), new UnaryExpr(-1L));
        String result = visitor.visit(expr);
        assertEquals("5.0", result);
    }

}