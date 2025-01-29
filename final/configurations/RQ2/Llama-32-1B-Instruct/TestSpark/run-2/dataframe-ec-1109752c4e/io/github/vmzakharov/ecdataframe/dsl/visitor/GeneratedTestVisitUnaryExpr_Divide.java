package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr_Divide {

    @Test
    public void testVisitUnaryExpr_Divide() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new UnaryExpr(new DecimalExpr(3).divide(new DecimalExpr(4)));
        String result = visitor.visit(expr);
        assertEquals("0.75", result);
    }

}