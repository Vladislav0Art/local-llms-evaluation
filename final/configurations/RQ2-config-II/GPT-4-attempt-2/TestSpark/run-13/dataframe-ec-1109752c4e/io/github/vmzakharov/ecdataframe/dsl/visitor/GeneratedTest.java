package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression e = new Value("Test Value");
        String result = PrettyPrintVisitor.exprToString(e);
        Assert.assertEquals("expected", result);
    }

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssingExpr expr = new AssingExpr("varX", "ExprX");
        visitor.visitAssignExpr(expr);
        Assert.assertEquals("varX := ExprX", visitor.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr binaryExpr = new BinaryExpr(new IntegerExpr(2), BinaryOp.PLUS, new IntegerExpr(3));
        visitor.visitBinaryExpr(binaryExpr);
        Assert.assertEquals("2 + 3", visitor.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new UnaryExpr(UnaryOp.NOT, new BooleanExpr(false)));
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals("not not false", visitor.toString());
    }

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value value = new BooleanExpr(true);
        visitor.visitConstExpr(value);
        Assert.assertEquals("true", visitor.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr expr = new FunctionCallExpr("someFunc", new ValueExpr("StringValue"));
        visitor.visitFunctionCallExpr(expr);
        Assert.assertEquals("someFunc('StringValue')", visitor.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr expr = new PropertyPathExpr("somePath");
        visitor.visitPropertyPathExpr(expr);
        Assert.assertEquals("obj.somePath", visitor.toString());
    }

}