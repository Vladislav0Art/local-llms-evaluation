package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        // Arrange
        AssingExpr expr = new AssingExpr(new VarExpr("a"), new DecimalExpr(new BigDecimal("10")));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        prettyPrintVisitor.visitAssignExpr(expr);
        // Assert
        assertEquals(prettyPrintVisitor.exprToString(expr), "a = 10");
    }

    @Test
    public void visitBinaryExprTest() {
        // Arrange
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), BinaryOp.ADD, new DecimalExpr(new BigDecimal("10")));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        prettyPrintVisitor.visitBinaryExpr(expr);
        // Assert
        assertEquals(prettyPrintVisitor.exprToString(expr), "a + 10");
    }

    @Test
    public void visitUnaryExprTest() {
        // Arrange
        UnaryExpr expr = new UnaryExpr(UnaryOp.MINUS, new VarExpr("a"));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        prettyPrintVisitor.visitUnaryExpr(expr);
        // Assert
        assertEquals(prettyPrintVisitor.exprToString(expr), "-a");
    }

    @Test
    public void exprToStringTest() {
        // Arrange
        DecimalExpr expr = new DecimalExpr(new BigDecimal("10"));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        String result = prettyPrintVisitor.exprToString(expr);
        // Assert
        assertEquals(result, "10");
    }

}