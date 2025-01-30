package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression testValue = new StringConstantExpr("5");
        assertEquals("'5'", PrettyPrintVisitor.exprToString(testValue));
    }

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = new AssingExpr("x", new StringConstantExpr("5"));
        expr.accept(visitor);
        assertEquals("x = '5'", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new StringConstantExpr("5"), BinaryOp.ADD, new StringConstantExpr("6"));
        expr.accept(visitor);
        assertEquals("('5' + '6')", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(UnaryOp.IS_NULL, new StringConstantExpr("true"));
        expr.accept(visitor);
        assertEquals("(true) is null", printer.toString());
    }

}