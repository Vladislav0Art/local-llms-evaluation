package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr(new VarExpr("a"), new StringValue("hello"));
        assertEquals("a = hello", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), BinaryOp.ADD, new StringValue("1"));
        assertEquals("a + 1", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new VarExpr("a"));
        assertEquals("!a", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitConstExprTest() {
        StringValue expr = new StringValue("test");
        assertEquals("test", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitVarExprTest() {
        VarExpr expr = new VarExpr("a");
        assertEquals("a", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = new FunctionCallExpr("test",
                Lists.immutable.with(new StringValue("hello"), new StringValue("world")));
        assertEquals("test(hello, world)", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = new PropertyPathExpr("a");
        assertEquals("a", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = new AnonymousScript(new StringValue("test"));
        assertEquals("test", PrettyPrintVisitor.exprToString(expr));
    }

}