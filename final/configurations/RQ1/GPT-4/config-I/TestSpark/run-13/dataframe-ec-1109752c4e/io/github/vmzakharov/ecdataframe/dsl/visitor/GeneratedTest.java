package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedTest {

    private static final VarExpr VAR_EXPR = new VarExpr("variable", false);

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr("var", false, VAR_EXPR);
        String expected = "var = variable";
        String actual = PrettyPrintVisitor.exprToString(assignExpr);
        assertEquals(expected, actual);
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(BinaryOp.ADDITION, VAR_EXPR, VAR_EXPR);
        String expected = "(variable + variable)";
        String actual = PrettyPrintVisitor.exprToString(binaryExpr);
        assertEquals(expected, actual);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.UNARY_MINUS, VAR_EXPR);
        String expected = "-(variable)";
        String actual = PrettyPrintVisitor.exprToString(unaryExpr);
        assertEquals(expected, actual);
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("testFun", FastList.newListWith(VAR_EXPR));
        String expected = "testFun(variable)";
        String actual = PrettyPrintVisitor.exprToString(functionCallExpr);
        assertEquals(expected, actual);
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr("alias", VAR_EXPR);
        String expected = "alias : variable";
        String actual = PrettyPrintVisitor.exprToString(aliasExpr);
        assertEquals(expected, actual);
    }

}