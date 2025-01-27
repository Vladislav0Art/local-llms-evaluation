package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringExpressionIsConvertedToPrettyString {

    @Test
    public void exprToStringExpressionIsConvertedToPrettyString() {
        Expression e = new DecimalExpr(1, 2);
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertEquals("DecimalExpr(id=1, value=2)", result);
    }

}