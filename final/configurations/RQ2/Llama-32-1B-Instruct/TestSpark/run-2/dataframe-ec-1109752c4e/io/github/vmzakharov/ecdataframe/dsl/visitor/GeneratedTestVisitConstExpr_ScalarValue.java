package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitConstExpr_ScalarValue {

    @Test
    public void testVisitConstExpr_ScalarValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new ConstExpr(new DecimalExpr(5));
        String result = visitor.visit(expr);
        assertEquals("5", result);
    }

}