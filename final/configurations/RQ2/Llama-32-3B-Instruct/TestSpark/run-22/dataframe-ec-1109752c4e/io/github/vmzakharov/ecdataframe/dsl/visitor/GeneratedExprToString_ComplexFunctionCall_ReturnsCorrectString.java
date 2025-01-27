package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToString_ComplexFunctionCall_ReturnsCorrectString {

    @Test
    public void exprToString_ComplexFunctionCall_ReturnsCorrectString() {
        FunctionScript functionScript = new FunctionScript(new VarExpr("x"), 2, new BinaryExpr(new ConstExpr(1), "+", new ConstExpr(3)));
        Expression expr = functionScript.getFunc();
        String result = PrettyPrintVisitor.exprToString(expr);
        assertEquals("(x+3)", result);
    }

}