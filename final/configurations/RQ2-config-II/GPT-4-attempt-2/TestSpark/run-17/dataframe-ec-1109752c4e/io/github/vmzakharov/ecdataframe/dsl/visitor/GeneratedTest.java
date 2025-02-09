package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("test"), BinaryOp.ADD, new VarExpr("test2"));
        String exprString = PrettyPrintVisitor.exprToString(binaryExpr);
        Assert.assertEquals("test + test2", exprString);
    }

    @Test
    public void visitAssignExprTest() {
        Printer printer = new CollectingPrinter();
        AssingExpr expr = new AssingExpr("varName", new VarExpr("testVar"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAssignExpr(expr);
        Assert.assertEquals("varName = testVar;\n", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        Printer printer = new CollectingPrinter();
        BinaryExpr expr = new BinaryExpr(new VarExpr("test"), BinaryOp.ADD, new VarExpr("test2"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitBinaryExpr(expr);
        Assert.assertEquals("test + test2", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        Printer printer = new CollectingPrinter();
        UnaryExpr expr = new UnaryExpr(UnaryOp.MINUS, new VarExpr("test"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals("-test", printer.toString());
    }

    @Test
    public void visitConstExprTest() {
        Printer printer = new CollectingPrinter();
        Value value = mock(Value.class);
        when(value.asStringLiteral()).thenReturn("5");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitConstExpr(value);
        Assert.assertEquals("5", printer.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        Printer printer = new CollectingPrinter();
        FunctionCallExpr expr = new FunctionCallExpr("testFunc", new FastList<>());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitFunctionCallExpr(expr);
        Assert.assertEquals("testFunc()", printer.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        Printer printer = new CollectingPrinter();
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("var"), "property");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitPropertyPathExpr(expr);
        Assert.assertEquals("var.property", printer.toString());
    }

}