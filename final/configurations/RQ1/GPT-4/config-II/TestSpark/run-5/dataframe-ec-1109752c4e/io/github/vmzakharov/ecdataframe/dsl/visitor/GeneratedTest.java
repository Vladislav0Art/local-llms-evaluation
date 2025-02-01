package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        StringValue value = new StringValue("Test");
        assertEquals("Test", PrettyPrintVisitor.exprToString(value));
    }

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = new AssingExpr(new VarExpr("a"), new StringValue("Test"));
        visitor.visitAssignExpr(expr);

        assertEquals("a = 'Test'", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), new VarExpr("b"), BinaryOp.ADD);
        visitor.visitBinaryExpr(expr);

        assertEquals("(a + b)", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(new VarExpr("a"), UnaryOp.NOT);
        visitor.visitUnaryExpr(expr);

        assertEquals("!a", printer.toString());
    }

    @Test
    public void visitConstExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        StringValue expr = new StringValue("Test");
        visitor.visitConstExpr(expr);

        assertEquals("'Test'", printer.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        PropertyPathExpr expr = new PropertyPathExpr("a.b.c");
        visitor.visitPropertyPathExpr(expr);

        assertEquals("a.b.c", printer.toString());
    }

}