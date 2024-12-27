package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        assertNotNull(prettyPrintVisitor);
    }

    @Test
    public void constructorWithPrinterTest() {
        Printer printer = mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        assertNotNull(prettyPrintVisitor);
    }

    @Test
    public void exprToStringTest() {
        Expression expression = mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(expression);
        assertNotNull(result);
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expression = mock(AssingExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAssignExpr(expression);
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expression = mock(BinaryExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitBinaryExpr(expression);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expression = mock(UnaryExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitUnaryExpr(expression);
    }

}