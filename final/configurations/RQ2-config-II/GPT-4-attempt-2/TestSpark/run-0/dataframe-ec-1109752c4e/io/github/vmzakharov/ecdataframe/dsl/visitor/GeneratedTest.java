package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr(null, null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitAssignExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(null, null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitBinaryExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = new UnaryExpr(null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitUnaryExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = new FunctionCallExpr(null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitFunctionCallExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = new PropertyPathExpr(null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitPropertyPathExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = new AnonymousScript(null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitAnonymousScriptExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = new FunctionScript(null, null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(expr);

        assertEquals("", printer.asString());
    }

    @Test
    public void exprToStringTest() {
        Expression expr = new AssingExpr(null, null, null);
        assertEquals("", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr expr = new IndexExpr(null, null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitIndexExpr(expr);

        assertEquals("", printer.asString());
    }

}