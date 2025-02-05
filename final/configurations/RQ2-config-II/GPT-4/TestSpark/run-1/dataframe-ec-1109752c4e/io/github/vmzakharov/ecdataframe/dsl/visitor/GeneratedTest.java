package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression binaryExpr = Mockito.mock(BinaryExpr.class);
        assertEquals("", PrettyPrintVisitor.exprToString(binaryExpr));
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = Mockito.mock(AssingExpr.class);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);

        visitor.visitAssignExpr(assignExpr);
        assertEquals("", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = Mockito.mock(BinaryExpr.class);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);

        visitor.visitBinaryExpr(binaryExpr);
        assertEquals("", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = Mockito.mock(UnaryExpr.class);
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);

        visitor.visitUnaryExpr(unaryExpr);
        verify(printer, times(1)).print("");
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = Mockito.mock(FunctionCallExpr.class);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);

        visitor.visitFunctionCallExpr(functionCallExpr);
        assertEquals("", printer.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = Mockito.mock(PropertyPathExpr.class);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);

        visitor.visitPropertyPathExpr(propertyPathExpr);
        assertEquals("", printer.toString());
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript anonymousScript = Mockito.mock(AnonymousScript.class);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);

        visitor.visitAnonymousScriptExpr(anonymousScript);
        assertEquals("", printer.toString());
    }

}