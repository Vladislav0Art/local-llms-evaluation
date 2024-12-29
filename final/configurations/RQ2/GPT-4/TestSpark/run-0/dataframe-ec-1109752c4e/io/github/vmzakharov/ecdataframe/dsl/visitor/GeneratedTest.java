package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = mock(BinaryExpr.class);
        Printer mockPrinter = mock(Printer.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(mockPrinter);

        printerVisitor.visitBinaryExpr(expr);
        verify(expr, times(2)).accept(printerVisitor);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = mock(UnaryExpr.class);
        Printer mockPrinter = mock(Printer.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(mockPrinter);

        printerVisitor.visitUnaryExpr(expr);
        verify(expr).accept(printerVisitor);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = mock(UnaryExpr.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(null);

        printerVisitor.visitUnaryExpr(expr);
        verify(expr).getOperand();
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = mock(UnaryExpr.class);
        Printer mockPrinter = mock(Printer.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(mockPrinter);

        printerVisitor.visitUnaryExpr(expr);
        verify(expr).getOperand();
    }

    @Test
    public void exprToStringTest() {
        Expression expr = mock(Expression.class);
        String expected = "testValue";

        when(expr.toString()).thenReturn(expected);
        String actual = PrettyPrintVisitor.exprToString(expr);

        assertEquals(expected, actual);
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = mock(AssingExpr.class);
        PrettyPrintVisitor visitor = mock(PrettyPrintVisitor.class);

        visitor.visitAssignExpr(expr);

        verify(visitor).visitAssignExpr(expr);
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = mock(PrettyPrintVisitor.class);

        visitor.visitBinaryExpr(expr);

        verify(visitor).visitBinaryExpr(expr);
    }

}