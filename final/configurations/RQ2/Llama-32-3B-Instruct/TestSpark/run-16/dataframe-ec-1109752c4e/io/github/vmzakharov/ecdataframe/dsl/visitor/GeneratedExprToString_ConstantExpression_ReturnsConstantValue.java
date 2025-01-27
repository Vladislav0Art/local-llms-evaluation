package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToString_ConstantExpression_ReturnsConstantValue {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_ConstantExpression_ReturnsConstantValue() {
        Expression e = new DecimalExpr(1);
        assertEquals("1", exprToString(e));
    }

}