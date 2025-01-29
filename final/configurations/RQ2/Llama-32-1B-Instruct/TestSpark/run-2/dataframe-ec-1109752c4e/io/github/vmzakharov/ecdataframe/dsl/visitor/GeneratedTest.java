package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTest {

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new AnonymousScriptExpr(new VarExpr("x"));
        expr.toString().println(visitor.visit(expr));
    }

    @Test
    public void testVisitBinaryExpr_Simple() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L));
        String result = visitor.visit(expr);
        assertEquals("3.0", result);
    }

    @Test
    public void testVisitBinaryExpr_SingleExpression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(5), new UnaryExpr(-1L));
        String result = visitor.visit(expr);
        assertEquals("5.0", result);
    }

    @Test
    public void testVisitBinaryExpr_Dot() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new DecimalExpr(4).dot());
        String result = visitor.visit(expr);
        assertEquals("12.0", result);
    }

    @Test
    public void testVisitBinaryExpr_Div() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L).div());
        String result = visitor.visit(expr);
        assertEquals("0.75", result);
    }

    @Test
    public void testVisitBinaryExpr_Add() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L).add());
        String result = visitor.visit(expr);
        assertEquals("4.0", result);
    }

    @Test
    public void testVisitBinaryExpr_Multiply() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new BinaryExpr(new DecimalExpr(3), new UnaryExpr(-1L).multiply());
        String result = visitor.visit(expr);
        assertEquals("0.75", result);
    }

    @Test
    public void testVisitUnaryExpr_Divide() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new UnaryExpr(new DecimalExpr(3).divide(new DecimalExpr(4)));
        String result = visitor.visit(expr);
        assertEquals("0.75", result);
    }

    @Test
    public void testVisitUnaryExpr_Sqrt() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new UnaryExpr(new DecimalExpr(3).sqrt());
        String result = visitor.visit(expr);
        assertEquals("1.7320508075688772", result);
    }

    @Test
    public void testVisitConstExpr_ScalarValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = new ConstExpr(new DecimalExpr(5));
        String result = visitor.visit(expr);
        assertEquals("5", result);
    }

}