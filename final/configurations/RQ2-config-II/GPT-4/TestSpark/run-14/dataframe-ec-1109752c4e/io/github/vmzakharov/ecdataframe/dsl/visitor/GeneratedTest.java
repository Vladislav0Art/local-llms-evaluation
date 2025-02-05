package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTest {

    @Test
    public void PrettyPrintVisitorDefaultConstructorTest() {
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor();
        assertNotEquals(ppvisitor, null);
    }

    @Test
    public void PrettyPrintVisitorParameterConstructorTest() {
        Printer printer = PrinterFactory.newPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        assertNotEquals(ppvisitor, null);
    }

    @Test
    public void exprToStringTest() {
        Expression expression = new AssingExpr("x", 1);
        String str = PrettyPrintVisitor.exprToString(expression);
        assertEquals("x = 1", str);
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assign = new AssingExpr("x", 1);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        ppvisitor.visitAssignExpr(assign);

        assertEquals("x = 1", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binary = new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(1));
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        ppvisitor.visitBinaryExpr(binary);

        assertEquals("x + 1.0", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unary = new UnaryExpr("-", new DecimalExpr(1));
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        ppvisitor.visitUnaryExpr(unary);

        assertEquals("-1.0", printer.toString());
    }

}