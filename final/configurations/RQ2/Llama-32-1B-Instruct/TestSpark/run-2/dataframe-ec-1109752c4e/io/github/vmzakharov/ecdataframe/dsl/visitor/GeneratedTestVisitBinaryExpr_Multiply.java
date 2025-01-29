package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Multiply {

    @Test
    public void testVisitBinaryExpr_Multiply() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L).multiply());
        String result = visitor.visit(expr);
        assertEquals("0.75", result);
    }

}