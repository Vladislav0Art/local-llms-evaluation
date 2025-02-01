package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        VarExpr varExpr = new VarExpr(new Reference(), "TestVar", false);
        assertEquals("TestVar", PrettyPrintVisitor.exprToString(varExpr));
    }

    @Test
    public void visitAssignExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        AssingExpr assingExpr = new AssingExpr(new Reference(), "x", new StringValue("Test String"), false);
        prettyPrintVisitor.visitAssignExpr(assingExpr);
        verify(mockPrinter).print("x = ");
    }

    @Test
    public void visitBinaryExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        BinaryExpr binaryExpr = new BinaryExpr(null, new DecimalValue(5), BinaryOp.ADD, new DecimalValue(3));
        prettyPrintVisitor.visitBinaryExpr(binaryExpr);
        verify(mockPrinter).print("(5 + 3)");
    }

    @Test
    public void visitUnaryExprTest_prefix() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NEG, new DecimalValue(3));
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        verify(mockPrinter).print("- (3)");
    }

    @Test
    public void visitUnaryExprTest_postfix() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.FACT, new DecimalValue(3));
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        verify(mockPrinter).print("(3) !");
    }

    @Test
    public void visitConstExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        StringValue stringValue = new StringValue("Test String");
        prettyPrintVisitor.visitConstExpr(stringValue);
        verify(mockPrinter).print("'Test String'");
    }

    @Test
    public void visitVarExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        VarExpr varExpr = new VarExpr(new Reference(), "TestVar", false);
        ExpressionVisitor expressionVisitor = new PrettyPrintVisitor(mockPrinter);
        expressionVisitor.visitVarExpr(varExpr);
        verify(mockPrinter).print("TestVar");
    }

}