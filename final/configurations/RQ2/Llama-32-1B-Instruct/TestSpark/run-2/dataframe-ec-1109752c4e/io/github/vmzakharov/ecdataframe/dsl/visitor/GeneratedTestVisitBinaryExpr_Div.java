package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Div {

    @Test
    public void testVisitBinaryExpr_Div() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L).div());
        String result = visitor.visit(expr);
        assertEquals("0.75", result);
    }

}