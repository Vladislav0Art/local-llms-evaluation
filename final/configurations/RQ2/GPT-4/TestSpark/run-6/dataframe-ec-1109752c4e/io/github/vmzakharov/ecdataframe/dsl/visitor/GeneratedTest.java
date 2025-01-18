package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExprMock = Mockito.mock(AssingExpr.class);
        Printer printer = new CollectingPrinter();

        new PrettyPrintVisitor(printer).visitAssignExpr(assignExprMock);

        assertEquals("<AssignExpr>", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExprMock = Mockito.mock(BinaryExpr.class);
        Printer printer = new CollectingPrinter();

        new PrettyPrintVisitor(printer).visitBinaryExpr(binaryExprMock);

        assertEquals("<BinaryExpr>", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExprMock = Mockito.mock(UnaryExpr.class);
        Printer printer = new CollectingPrinter();

        new PrettyPrintVisitor(printer).visitUnaryExpr(unaryExprMock);

        assertEquals("<UnaryExpr>", printer.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExprMock = Mockito.mock(FunctionCallExpr.class);
        Printer printer = new CollectingPrinter();

        new PrettyPrintVisitor(printer).visitFunctionCallExpr(functionCallExprMock);

        assertEquals("<FunctionCallExpr>", printer.toString());
    }

    @Test
    public void visitVarExprTest() {
        VarExpr varExprMock = Mockito.mock(VarExpr.class);
        Printer printer = new CollectingPrinter();

        new PrettyPrintVisitor(printer).visitVarExpr(varExprMock);

        assertEquals("<VarExpr>", printer.toString());
    }

}