package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitDecimalExpr {

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression decimalExpr = new DecimalExpr(
                "subtract",
                2,
                new VarExpr("x")
        );
        String result = visitor.visit(decimalExpr);
        assertEquals("\"0.0\"$", result);
    }

}