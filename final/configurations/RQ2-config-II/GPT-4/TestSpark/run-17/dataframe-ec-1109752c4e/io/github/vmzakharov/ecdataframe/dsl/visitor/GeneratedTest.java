package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        VarExpr varExpr = new VarExpr(null, "varExprTest");
        Assert.assertEquals("varExprTest", PrettyPrintVisitor.exprToString(varExpr));
    }

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        AssingExpr assignExpr = new AssingExpr(null, "a", new DecimalExpr(null, new BigDecimal(10)));
        visitor.visitAssignExpr(assignExpr);
        Assert.assertEquals("a = 10", collectingPrinter.getBufferAsString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, new DecimalExpr(null, new BigDecimal(10)), BinaryOp.ADD, new DecimalExpr(null, new BigDecimal(5)));
        Assert.assertEquals("10 + 5", PrettyPrintVisitor.exprToString(binaryExpr));
    }

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        VarExpr varExpr = new VarExpr(null, "varExprTest");
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.MINUS, varExpr);
        visitor.visitUnaryExpr(unaryExpr);
        Assert.assertEquals("-varExprTest", collectingPrinter.getBufferAsString());
    }

    @Test
    public void visitConstExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        Value value = DecimalValue.newDecimalValue(new BigDecimal(123.45));
        visitor.visitConstExpr(value);
        Assert.assertEquals("123.45", collectingPrinter.getBufferAsString());
    }

}