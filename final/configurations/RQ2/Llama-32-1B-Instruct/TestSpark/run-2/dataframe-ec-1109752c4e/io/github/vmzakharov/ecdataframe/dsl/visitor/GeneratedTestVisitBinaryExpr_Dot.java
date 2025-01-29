package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Dot {

    @Test
    public void testVisitBinaryExpr_Dot() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new DecimalExpr(4).dot());
        String result = visitor.visit(expr);
        assertEquals("12.0", result);
    }

}