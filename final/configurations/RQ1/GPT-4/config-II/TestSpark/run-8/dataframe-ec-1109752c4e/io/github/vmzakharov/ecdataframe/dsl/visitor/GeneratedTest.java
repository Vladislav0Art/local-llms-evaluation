package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assingExpr = new AssingExpr(null, "x", new ConstExpr(new StringValue("test")), false);
        assertEquals("x = \"test\"", PrettyPrintVisitor.exprToString(assingExpr));
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, new ConstExpr(new IntValue(5)), BinaryOp.ADDITION, new ConstExpr(new IntValue(3)));
        assertEquals("(5 + 3)", PrettyPrintVisitor.exprToString(binaryExpr));
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NEGATE, new ConstExpr(new IntValue(5)));
        assertEquals("- (5)", PrettyPrintVisitor.exprToString(unaryExpr));
    }

    @Test
    public void visitConstExprTest() {
        ConstExpr constExpr = new ConstExpr(new StringValue("test"));
        assertEquals("\"test\"", PrettyPrintVisitor.exprToString(constExpr));
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr(null, "func", Lists.mutable.of(new ConstExpr(new IntValue(10)), new ConstExpr(new IntValue(20))));
        assertEquals("func(10, 20)", PrettyPrintVisitor.exprToString(functionCallExpr));
    }

    @Test
    public void visitVarExprTest() {
        VarExpr varExprEscaped = new VarExpr(null, "x", true);
        assertEquals("${x}", PrettyPrintVisitor.exprToString(varExprEscaped));

        VarExpr varExpr = new VarExpr(null, "y", false);
        assertEquals("y", PrettyPrintVisitor.exprToString(varExpr));
    }

}