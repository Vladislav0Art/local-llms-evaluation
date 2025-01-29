package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitUnaryExpr {

    @Test
    public void testVisitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression unaryExpr = new UnaryExpr(new VarExpr("x"), "negate");
        String result = visitor.visit(unaryExpr);
        assertEquals("\"-1.0\"$", result);
    }

}