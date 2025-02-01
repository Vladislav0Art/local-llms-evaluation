package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr mockExpr = Mockito.mock(AssingExpr.class);
        Mockito.when(mockExpr.getVarName()).thenReturn("testVar");
        Mockito.when(mockExpr.isEscaped()).thenReturn(false);
        Mockito.when(mockExpr.getExpression()).thenReturn(new DecimalExpr(new BigInteger("10"), 2));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAssignExpr(mockExpr);

        Assert.assertEquals("testVar = 10", printer.toString().trim());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr mockExpr = Mockito.mock(BinaryExpr.class);
        Mockito.when(mockExpr.getOperand1()).thenReturn(new DecimalExpr(new BigInteger("10"), 2));
        Mockito.when(mockExpr.getOperand2()).thenReturn(new DecimalExpr(new BigInteger("20"), 2));
        Mockito.when(mockExpr.getOperation()).thenReturn(BinaryExpr.Operation.ADD);

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitBinaryExpr(mockExpr);

        Assert.assertEquals("(10 + 20)", printer.toString().trim());
    }

    @Test
    public void visitUnaryExprPrefixTest() {
        UnaryExpr mockExpr = Mockito.mock(UnaryExpr.class);
        Mockito.when(mockExpr.getOperation()).thenReturn(UnaryExpr.Operation.NOT);
        Mockito.when(mockExpr.getOperand()).thenReturn(new BooleanValue(false));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitUnaryExpr(mockExpr);

        Assert.assertEquals("!" + "(" + "F" + ")", printer.toString().trim());
    }

    @Test
    public void visitConstExprTest() {
        StringValue mockExpr = Mockito.mock(StringValue.class);
        Mockito.when(mockExpr.asStringLiteral()).thenReturn("\"test\"");

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitConstExpr(mockExpr);

        Assert.assertEquals("\"test\"", printer.toString().trim());
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr mockExpr = Mockito.mock(DecimalExpr.class);
        Mockito.when(mockExpr.unscaledValueExpr()).thenReturn(new DecimalExpr(new BigInteger("10"), 2));
        Mockito.when(mockExpr.scaleExpr()).thenReturn(new DecimalExpr(new BigInteger("20"), 2));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitDecimalExpr(mockExpr);

        Assert.assertEquals("[10,20]", printer.toString().trim());
    }

}