package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.IfElseExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void visitAssignExprEscapeNeededTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        AssingExpr expr = Mockito.mock(AssingExpr.class);
        Mockito.when(expr.isEscaped()).thenReturn(true);
        Mockito.when(expr.getVarName()).thenReturn("varName");
        Mockito.when(expr.getExpression()).thenReturn(Mockito.mock(Expression.class));

        visitor.visitAssignExpr(expr);

        Mockito.verify(mockPrinter).print("${varName} = ");
    }

    @Test
    public void visitBinaryExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        Mockito.when(expr.asString()).thenReturn("testString");

        visitor.visitBinaryExpr(expr);

        Mockito.verify(mockPrinter).print("(testString)");
    }

    @Test
    public void exprToStringTest() {
        Expression expr = Mockito.mock(Expression.class);
        String str = PrettyPrintVisitor.exprToString(expr);

        assertNotNull(str);
    }

    @Test
    public void visitFunctionCallExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        FunctionCallExpr expr = Mockito.mock(FunctionCallExpr.class);
        Mockito.when(expr.getFunctionName()).thenReturn("testFunc");

        visitor.visitFunctionCallExpr(expr);

        Mockito.verify(mockPrinter).print("testFunc()");
    }

    @Test
    public void visitVarExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        VarExpr expr = Mockito.mock(VarExpr.class);
        Mockito.when(expr.getVariableName()).thenReturn("varName");

        visitor.visitVarExpr(expr);

        Mockito.verify(mockPrinter).print("varName");
    }

    @Test
    public void visitAliasExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        AliasExpr expr = Mockito.mock(AliasExpr.class);
        Mockito.when(expr.getAlias()).thenReturn("alias");
        visitor.visitAliasExpr(expr);

        Mockito.verify(mockPrinter).print("alias : ");
    }

    @Test
    public void visitDecimalExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        DecimalExpr expr = Mockito.mock(DecimalExpr.class);

        visitor.visitDecimalExpr(expr);

        Mockito.verify(mockPrinter).print("[,]");
    }

    @Test
    public void visitIfElseExprTernaryIsTrueTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        IfElseExpr expr = Mockito.mock(IfElseExpr.class);
        Mockito.when(expr.isTernary()).thenReturn(true);

        visitor.visitIfElseExpr(expr);

        Mockito.verify(mockPrinter).print(" ?  : ");
    }

}