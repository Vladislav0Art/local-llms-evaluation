package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitBinaryExpr_Add {

    @Test
    public void testVisitBinaryExpr_Add() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L).add());
        String result = visitor.visit(expr);
        assertEquals("4.0", result);
    }

}