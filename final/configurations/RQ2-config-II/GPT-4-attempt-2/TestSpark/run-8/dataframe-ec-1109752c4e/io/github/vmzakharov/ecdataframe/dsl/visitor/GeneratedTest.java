package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expression = new VarExpr("testVar");
        String expected = "testVar";
        Assert.assertEquals(expected, PrettyPrintVisitor.exprToString(expression));
    }

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        AssingExpr assignExpr = new AssingExpr(new VarExpr("var"), new DecimalExpr(10));
        visitor.visitAssignExpr(assignExpr);
        Assert.assertEquals("var = 10", visitor.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("var"), "+", new DecimalExpr(10));
        visitor.visitBinaryExpr(binaryExpr);
        Assert.assertEquals("var + 10", visitor.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        UnaryExpr unaryExpr = new UnaryExpr("-", new DecimalExpr(10));
        visitor.visitUnaryExpr(unaryExpr);
        Assert.assertEquals("- 10", visitor.toString());
    }

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        Value value = Value.newValue(20);
        visitor.visitConstExpr(value);
        Assert.assertEquals("20", visitor.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("fun", null);
        visitor.visitFunctionCallExpr(functionCallExpr);
        Assert.assertEquals("fun()", visitor.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("test.property");
        visitor.visitPropertyPathExpr(propertyPathExpr);
        Assert.assertEquals("test.property", visitor.toString());
    }

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        VarExpr varExpr = new VarExpr("var");
        visitor.visitVarExpr(varExpr);
        Assert.assertEquals("var", visitor.toString());
    }

    @Test
    public void visitProjectionExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        ProjectionExpr projectionExpr = new ProjectionExpr(new VarExpr("var"), new DecimalExpr(10));
        visitor.visitProjectionExpr(projectionExpr);
        Assert.assertEquals("( var ~ 10 )", visitor.toString());
    }

    @Test
    public void visitIfElseExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        IfElseExpr ifElseExpr = new IfElseExpr(new BinaryExpr(new VarExpr("var"), ">", new DecimalExpr(10)), new DecimalExpr(1), new DecimalExpr(-1));
        visitor.visitIfElseExpr(ifElseExpr);
        Assert.assertEquals("if ( var > 10 ) then 1 else -1 end", visitor.toString());
    }

}