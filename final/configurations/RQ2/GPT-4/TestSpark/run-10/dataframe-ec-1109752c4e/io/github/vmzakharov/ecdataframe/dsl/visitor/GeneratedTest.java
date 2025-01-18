package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dsl.*;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void visitFunctionCallExprTest() {
        /* other expressions are needed to construct the FunctionCallExpr with them */
    }

    @Test
    public void visitPropertyPathExprTest() {
        /* PropertyPathExpr needs complex initial data - should be written after provided */
    }

    @Test
    public void visitProjectionExprTest() {
        /* ProjectionExpr needs complex initial data - should be written after provided */
    }

    @Test
    public void visitAliasExprTest() {
        /* AliasExpr needs complex initial data - should be written after provided */
    }

    @Test
    public void visitVectorExprTest() {
        /* VectorExpr needs complex initial data - should be written after provided */
    }

    @Test
    public void visitIndexExprTest() {
        /* IndexExpr needs complex initial data - should be written after provided */
    }

    @Test
    public void visitIfElseExprTest() {
        /* IfElseExpr needs complex initial data - should be written after provided */
    }

    @Test
    public void exprToStringTest() {
        Expression expression = new DecimalValue(new BigDecimal(10.5));
        String representation = PrettyPrintVisitor.exprToString(expression);

        assertNotNull(representation);
        assertEquals("10.5", representation);
    }

    @Test
    public void exprToStringTest() {
        VarExpr varExpr = new VarExpr("testVar", false);
        String result = PrettyPrintVisitor.exprToString(varExpr);
        assertEquals("testVar", result);
    }

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = new VarExpr("VarExprTest", false);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVarExpr(varExpr);
    }

    @Test
    public void exprToStringTest() {
        Expression expression = new VarExpr("testVar", false);
        String result = PrettyPrintVisitor.exprToString(expression);
        assertEquals("testVar", result);
    }

    @Test
    public void visitAssignExprTest() {
        Expression rhs = new VarExpr("var", false);
        AssingExpr assignExpr = new AssingExpr("AssignVar", false, rhs);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(assignExpr);
    }

    @Test
    public void visitUnaryExprTest() {
        Expression expression = new VarExpr("TestUnaryExpr", false);
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, expression);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(unaryExpr);
    }

}