package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();
    private Printer printer = PrinterFactory.create();

    public void testVisitAssignExpr() {
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new DecimalExpr(5));
        visitor.visitAssignExpr(expr);
        assertTrue(printer.getOutput().contains("x <- 5"));
    }

    @Test
    public void testVisitBinaryExpr() {
        BinaryExpr expr = new BinaryExpr(new FunctionCallExpr("plus"),
                new Value(1), new Value(2));
        visitor.visitBinaryExpr(expr);
        assertTrue(printer.getOutput().contains("+ 1 2"));
    }

    public void testVisitUnaryExpr() {
        UnaryExpr expr = new UnaryExpr(new FunctionCallExpr("negate"),
                new DecimalExpr(5));
        visitor.visitUnaryExpr(expr);
        assertTrue(printer.getOutput().contains("-5"));
    }

    public void testVisitConstExpr() {
        Value expr = new Value(10);
        visitor.visitConstExpr(expr);
        assertTrue(printer.getOutput().contains("10"));
    }

    public void testVisitFunctionCallExpr() {
        FunctionCallExpr expr = new FunctionCallExpr(new PropertyPathExpr("length"),
                new VectorExpr(new Value(1), new Value(2)));
        visitor.visitFunctionCallExpr(expr);
        assertTrue(printer.getOutput().contains("5"));
    }

    public void testVisitPropertyPathExpr() {
        PropertyPathExpr expr = new PropertyPathExpr(new AliasExpr("x"), new VarExpr("y"));
        visitor.visitPropertyPathExpr(expr);
        assertTrue(printer.getOutput().contains("x.y"));
    }

    public void testVisitAnonymousScriptExpr() {
        AnonymousScript expr = new AnonymousScript(new StatementSequenceScript(
                new IfElseExpr(new FunctionCallExpr("greater"),
                        new Value(5), new DecimalExpr(10)),
                new VectorExpr(new Value(1), new Value(2))));
        visitor.visitAnonymousScriptExpr(expr);
        assertTrue(printer.getOutput().contains("if greater(5, 10) { 1, 2 } else { 1, 2 }"));
    }

    public void testVisitFunctionScriptExpr() {
        FunctionScript expr = new FunctionScript(new VarExpr("x"),
                new StatementSequenceScript(
                        new IfElseExpr(new FunctionCallExpr("greater"),
                                new Value(5), new DecimalExpr(10)),
                        new VectorExpr(new Value(1), new Value(2))));
        visitor.visitFunctionScriptExpr(expr);
        assertTrue(printer.getOutput().contains("function x { if greater(x, 10) { 1, 2 } else { 1, 2 } }"));
    }

    public void testVisitStatementSequenceScript() {
        StatementSequenceScript expr = new StatementSequenceScript(
                new IfElseExpr(new FunctionCallExpr("greater"),
                        new Value(5), new DecimalExpr(10)),
                new VectorExpr(new Value(1), new Value(2)));
        visitor.visitStatementSequenceScript(expr);
        assertTrue(printer.getOutput().contains("if greater(5, 10) { 1, 2 } else { 1, 2 }"));
    }

    public void testVisitVarExpr() {
        VarExpr expr = new VarExpr("x");
        visitor.visitVarExpr(expr);
        assertTrue(printer.getOutput().contains("x"));
    }

    public void testVisitProjectionExpr() {
        ProjectionExpr expr = new ProjectionExpr(new VectorExpr(new Value(1), new Value(2)), "x");
        visitor.visitProjectionExpr(expr);
        assertTrue(printer.getOutput().contains("x[1, 2]"));
    }

    public void testVisitAliasExpr() {
        AliasExpr expr = new AliasExpr(new VarExpr("y"), "x");
        visitor.visitAliasExpr(expr);
        assertTrue(printer.getOutput().contains("x <- y"));
    }

    public void testVisitVectorExpr() {
        VectorExpr expr = new VectorExpr(new Value(1), new Value(2));
        visitor.visitVectorExpr(expr);
        assertTrue(printer.getOutput().contains("[1, 2]"));
    }

    public void testVisitIndexExpr() {
        IndexExpr expr = new IndexExpr(new VectorExpr(new Value(1), new Value(2)), new Value(0));
        visitor.visitIndexExpr(expr);
        assertTrue(printer.getOutput().contains("[1][0]"));
    }

    public void testVisitDecimalExpr() {
        DecimalExpr expr = new DecimalExpr(5.5);
        visitor.visitDecimalExpr(expr);
        assertTrue(printer.getOutput().contains("5.5"));
    }

    public void testVisitIfElseExpr() {
        IfElseExpr expr = new IfElseExpr(new FunctionCallExpr("greater"),
                new Value(5), new DecimalExpr(10));
        visitor.visitIfElseExpr(expr);
        assertTrue(printer.getOutput().contains("if greater(5, 10) { } else { }"));
    }

    public void testVisitNull() {
        Expression expr = null;
        try {
            visitor.visitAssignExpr(expr);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}