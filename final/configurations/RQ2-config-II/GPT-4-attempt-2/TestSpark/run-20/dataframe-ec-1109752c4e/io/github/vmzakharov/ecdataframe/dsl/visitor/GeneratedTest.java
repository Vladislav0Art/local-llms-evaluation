package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);
        String expected = "expected string";
        Mockito.when(expression.evalAsString()).thenReturn(expected);

        String result = PrettyPrintVisitor.exprToString(expression);

        assertEquals(expected, result);
    }

    @Test
    public void visitAssignExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        AssingExpr expression = Mockito.mock(AssingExpr.class);

        new PrettyPrintVisitor(printer).visitAssignExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        BinaryExpr expression = Mockito.mock(BinaryExpr.class);

        new PrettyPrintVisitor(printer).visitBinaryExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        UnaryExpr expression = Mockito.mock(UnaryExpr.class);

        new PrettyPrintVisitor(printer).visitUnaryExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        FunctionCallExpr expression = Mockito.mock(FunctionCallExpr.class);

        new PrettyPrintVisitor(printer).visitFunctionCallExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PropertyPathExpr expression = Mockito.mock(PropertyPathExpr.class);

        new PrettyPrintVisitor(printer).visitPropertyPathExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        AnonymousScript expression = Mockito.mock(AnonymousScript.class);

        new PrettyPrintVisitor(printer).visitAnonymousScriptExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitFunctionScriptExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        FunctionScript expression = Mockito.mock(FunctionScript.class);

        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        Printer printer = Mockito.mock(Printer.class);
        StatementSequenceScript expression = Mockito.mock(StatementSequenceScript.class);

        new PrettyPrintVisitor(printer).visitStatementSequenceScript(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitVarExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        VarExpr expression = Mockito.mock(VarExpr.class);

        new PrettyPrintVisitor(printer).visitVarExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

    @Test
    public void visitProjectionExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        ProjectionExpr expression = Mockito.mock(ProjectionExpr.class);

        new PrettyPrintVisitor(printer).visitProjectionExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}