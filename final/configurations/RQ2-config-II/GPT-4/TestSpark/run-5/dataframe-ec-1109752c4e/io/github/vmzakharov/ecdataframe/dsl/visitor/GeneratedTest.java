package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expr = new AssingExpr(new VarExpr("x"), new DecimalExpr(10));
        String output = PrettyPrintVisitor.exprToString(expr);
        assertEquals("x = 10", output);
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new DecimalExpr(10));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        expr.visit(visitor);
        assertEquals("x = 10", printer.asString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(
                new VarExpr("x"),
                BinaryOp.ADD,
                new DecimalExpr(10)
        );
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        expr.visit(visitor);
        assertEquals("x + 10", printer.asString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = new UnaryExpr(UnaryOp.MINUS, new DecimalExpr(10));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        expr.visit(visitor);
        assertEquals("-10", printer.asString());
    }

    @Test
    public void visitConstExprTest() {
        Value expr = new StringValue("Hello");
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitConstExpr(expr);
        assertEquals("'Hello'", printer.asString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        ArgList arguments = new ArgList(Arrays.asList("John", "Doe"));
        FunctionCallExpr expr = new FunctionCallExpr("printFullName", arguments);
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        expr.visit(visitor);
        assertEquals("printFullName('John', 'Doe')", printer.asString());
    }

}