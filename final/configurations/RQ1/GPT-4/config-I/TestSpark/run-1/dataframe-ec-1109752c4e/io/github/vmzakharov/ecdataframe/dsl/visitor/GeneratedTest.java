package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = new DecimalExpr(new DoubleValue(10), new DoubleValue(12.0));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        expr.accept(visitor);
        assertEquals("[10, 12]", visitor.exprToString(expr));
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr("x", false, new DoubleValue(10.0));
        CollectingPrinter printer = new CollectingPrinter();
        expr.accept(new PrettyPrintVisitor(printer));
        assertEquals("x = 10", printer.toString());
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = new DecimalExpr(new DoubleValue(10), new DoubleValue(2));
        CollectingPrinter printer = new CollectingPrinter();
        expr.accept(new PrettyPrintVisitor(printer));
        assertEquals("[10, 2]", printer.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = new FunctionCallExpr("sum", Lists.mutable.of(mock(Expression.class)));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitFunctionCallExpr(expr);
        assertEquals("sum()", printer.toString());
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = new DecimalExpr(mock(Expression.class), mock(Expression.class));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitDecimalExpr(expr);
        assertEquals("[]", printer.toString());
    }

}