package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr_Sqrt {

    @Test
    public void testVisitUnaryExpr_Sqrt() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new UnaryExpr(new DecimalExpr(3).sqrt());
        String result = visitor.visit(expr);
        assertEquals("1.7320508075688772", result);
    }

}