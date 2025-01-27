package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToString_ExpressionWithVariable_ReturnsVariableName {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_ExpressionWithVariable_ReturnsVariableName() {
        Expression e = new VarExpr("x");
        assertEquals("x", exprToString(e));
    }

}