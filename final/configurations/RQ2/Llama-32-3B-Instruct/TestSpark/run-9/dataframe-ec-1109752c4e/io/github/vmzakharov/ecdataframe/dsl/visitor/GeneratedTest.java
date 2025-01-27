package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedTest {

    @Test
    public void exprToStringExpressionIsStringTest() {
        Expression expression = new Expression();
        String result = PrettyPrintVisitor.exprToString(expression);
        assertNotNull(result);
    }

    @Test
    public void exprToStringNullExpressionReturnsNullTest() {
        Expression expression = null;
        String result = PrettyPrintVisitor.exprToString(expression);
        assertNull(result);
    }

    @Test
    public void visitAssignExprVisitorShouldPrintAssignmentTest() {
        AssigningExpr assigningExpr = new AssigningExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(assigningExpr);
        assertTrue(String.contains("=", visitor.getPrinter().toString()));
    }

    @Test
    public void visitBinaryExprVisitorShouldPrintBinaryExpressionTest() {
        BinaryExpr binaryExpr = new BinaryExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(binaryExpr);
        assertTrue(String.contains("+", visitor.getPrinter().toString()));
    }

    @Test
    public void visitUnaryExprVisitorShouldPrintUnaryExpressionTest() {
        UnaryExpr unaryExpr = new UnaryExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(unaryExpr);
        assertTrue(String.contains("-", visitor.getPrinter().toString()));
    }

    @Test
    public void visitConstExprVisitorShouldPrintConstantValueTest() {
        Value value = new Value();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(value);
        assertTrue(String.contains(String.valueOf(value), visitor.getPrinter().toString()));
    }

}