package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        VarExpr varExpr = new VarExpr("TestVariableName", false);
        assertEquals("TestVariableName", PrettyPrintVisitor.exprToString(varExpr));
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr("TestVariableName", new DecimalValue(new DecimalValue(10).asBigDecimal()));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        assignExpr.accept(prettyPrintVisitor);
        assertEquals("TestVariableName = 10", prettyPrintVisitor.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("hello", false), BinaryOperator.PLUS, new VarExpr("world", false));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        binaryExpr.accept(prettyPrintVisitor);
        assertEquals("(hello + world)", prettyPrintVisitor.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(new VarExpr("TestVariableName", false), UnaryOperator.MINUS);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        unaryExpr.accept(prettyPrintVisitor);
        assertEquals("-TestVariableName", prettyPrintVisitor.toString());
    }

    @Test
    public void visitConstExprTest() {
        DecimalValue decimalconstExpr = new DecimalValue("10");
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        prettyPrintVisitor.visitConstExpr(decimalconstExpr);
        assertEquals("10", prettyPrintVisitor.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("TestFunction", Lists.fixedSize.of(new VarExpr("TestVarParam", false)));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        functionCallExpr.accept(prettyPrintVisitor);
        assertEquals("TestFunction(TestVarParam)", prettyPrintVisitor.toString());
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr("TestAlias", new VarExpr("TestVariableName", false));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        aliasExpr.accept(prettyPrintVisitor);
        assertEquals("TestAlias : TestVariableName", prettyPrintVisitor.toString());
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(new VarExpr("TestConditionVariableName", false), new VarExpr("TestIfScriptVarName", false), new VarExpr("TestElseScriptVarName", false));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        ifElseExpr.accept(prettyPrintVisitor);
        assertEquals("TestConditionVariableName ? TestIfScriptVarName : TestElseScriptVarName", prettyPrintVisitor.toString());
    }

}